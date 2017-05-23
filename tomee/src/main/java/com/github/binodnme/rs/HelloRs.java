package com.github.binodnme.rs;

import com.github.binodnme.service.TestService;
import org.apache.tomee.embedded.Configuration;
import org.apache.tomee.embedded.Container;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Binod Shrestha <binodshrestha@lfetchnology.com> on 11/10/2016.
 */
@Path("/")
public class HelloRs {
    @Inject
    TestService testService;

    @Path("/")
    @GET
    public String helloWorld(){
        return testService.testMethod();
    }

}
