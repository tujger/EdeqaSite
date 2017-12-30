/**
 * Copyright (C) Edeqa <http://www.edeqa.com>
 *
 * Created 12/28/17.
 */

function HomeHolder(main) {

    this.category = DRAWER.SECTION_PRIMARY;
    this.type = "home";
    this.title = "Home";
    this.menu = "Home";
    this.icon = "home";

    this.start = function() {
        console.log("START HOME");
    };

    this.resume = function() {
        console.log("RESUME HOME");
    }

    this.onEvent = function(event, object) {
        switch(event) {
            case EVENTS.API:
                console.log("INDEX HOME");
                u.byId("content").innerHTML = u.lang.api_body.innerHTML;
                u.byId("content").classList.add("content-api");
                if(object) object();
                break;
        }
        return true;
    }

}