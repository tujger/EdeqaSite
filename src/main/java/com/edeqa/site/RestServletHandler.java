package com.edeqa.site;


import com.edeqa.site.rest.Test;

import javax.servlet.ServletException;

public class RestServletHandler extends com.edeqa.edequate.RestServletHandler {

    @Override
    public void init() throws ServletException {
        super.init();
        useDefault();
//        populateRestActions(getClass().getPackage().getName() + ".rest");
        registerAction(new Test());
        registerActionsPool();
    }

}