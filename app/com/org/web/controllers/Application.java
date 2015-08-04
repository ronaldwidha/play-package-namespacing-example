package com.org.web.controllers;

import com.google.inject.Inject;
import com.org.web.services.ServiceClient;
import play.libs.F.Promise;
import play.mvc.*;
import com.org.web.views.html.*;

public class Application extends Controller {

    private final ServiceClient client;

    @Inject
    public Application(ServiceClient client) {
        this.client = client;
    }

    public Promise<Result> index() {

        Promise<Result> promise = client.doSomething()
                .map(model -> ok(index.render("do something with the model", model)));

        return promise;
    }
}
