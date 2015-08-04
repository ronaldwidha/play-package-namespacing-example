package com.org.web.services;

import com.org.web.models.Model;
import play.libs.F;

/**
 * Created by rsunarno on 8/4/15.
 */
public interface ServiceClient {
    F.Promise<Model> doSomething();
}
