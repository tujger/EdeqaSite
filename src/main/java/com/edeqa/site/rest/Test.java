package com.edeqa.site.rest;

import com.edeqa.edequate.abstracts.AbstractAction;
import com.edeqa.edequate.helpers.RequestWrapper;
import com.edeqa.helpers.Misc;

import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;

public class Test extends AbstractAction<RequestWrapper> {

    @Override
    public String getType() {
        return "test";
    }

    @Override
    public boolean onEvent(JSONObject json, RequestWrapper request) {
        try {
            Misc.log("Test", "requested: ");
            ArrayList<File> files = new ArrayList<>();

                json.put(STATUS, STATUS_SUCCESS);
                json.put(CODE, CODE_STRING);
                json.put(MESSAGE, "Test");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}


