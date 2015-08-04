package com.org.web.services;

import com.org.web.models.Model;
import play.Logger;
import play.libs.F;

/**
 * Created by rsunarno on 8/4/15.
 */
public class AwesomeServiceClient implements ServiceClient {

    @Override
    public F.Promise<Model> doSomething() {

        Logger.info("do something meaningful");

        F.Promise<Model> promise = F.Promise.promise( () -> new Model("I'm a model"));

        return promise;
    }
}
