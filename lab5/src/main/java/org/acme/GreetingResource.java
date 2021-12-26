package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//путь
@Path("/hello")
public class GreetingResource {

    @Inject//сообщает GreetingResource что MyInterface бина
    @MyAnnotation
    MyInterface myInterface;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        myInterface.draw();
        return "Hello RESTEasy";
    }
}