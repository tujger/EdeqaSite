package com.edeqa.site;


import javax.servlet.ServletException;

public class RestServletHandler extends com.edeqa.edequate.RestServletHandler {

    @Override
    public void init() throws ServletException {
        super.init();
        useDefault();
        populateRestActions(getClass().getPackage().getName() + ".rest");
    }

}