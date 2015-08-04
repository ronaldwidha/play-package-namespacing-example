package com.org.web.modules;

/*
 * Created by IntelliJ IDEA.
 * User: rsunarno
 * Date: 7/15/15
 * Time: 8:46 PM
 */

import com.google.inject.AbstractModule;
import com.org.web.services.AwesomeServiceClient;
import com.org.web.services.ServiceClient;

public class ThisProjectModule extends AbstractModule {

    @Override
    protected void configure() {
        //add configuration logic here
        bind(ServiceClient.class).to(AwesomeServiceClient.class);
    }
}
