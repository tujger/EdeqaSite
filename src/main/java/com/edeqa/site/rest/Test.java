package com.edeqa.site.rest;

import com.edeqa.edequate.helpers.RequestWrapper;
import com.edeqa.edequate.interfaces.RestAction;
import com.edeqa.helpers.Misc;

import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;

public class Test implements RestAction {

    public static final String actionName = "test";

    @Override
    public void call(JSONObject json, RequestWrapper request) {
        try {
            Misc.log("Test", "requested: ");

            ArrayList<File> files = new ArrayList<>();

                json.put(STATUS, STATUS_SUCCESS);
                json.put(CODE, CODE_STRING);
                json.put(MESSAGE, "Test");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


