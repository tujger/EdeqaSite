/**
 * Copyright (C) Edeqa <http://www.edeqa.com>
 *
 * Created 12/30/17.
 */

function EdequateHolder(main) {

    this.category = DRAWER.SECTION_EXPLORE;
    this.type = "edequate";
    this.title = "Edequate";
    this.menu = "Edequate";
    this.icon = u.create(HTML.IMG, {
        src: "/images/edequate-gray.svg",
        className: "icon drawer-menu-item-icon"
    });

    this.start = function() {
        console.log("Starting EdequateHolder");
    };

    this.resume = function() {
        console.log("Resuming EdequateHolder");
        u.progress.show(u.lang.loading);
        u.clear(main.content);
        u.post("/rest/v1/content", {resource: "main-edequate.html", locale: main.selectLang.value}).then(function(xhr){
            u.create(HTML.DIV, {className: "content-normal", innerHTML: xhr.response}, main.content);
            u.progress.hide();
        }).catch(function(error, json) {
            console.error(json);
            u.create(HTML.DIV, {className: "content-centered", innerHTML: "Error"}, main.content);
            u.progress.hide();
        });
    }

    this.onEvent = function(event, object) {
        console.log("onEvent", event, object);
//        switch(event) {
//            case EVENTS.API:
//                console.log("INDEX HOME");
//                u.byId("content").innerHTML = u.lang.api_body.innerHTML;
//                u.byId("content").classList.add("content-api");
//                if(object) object();
//                break;
//        }
        return true;
    }

}