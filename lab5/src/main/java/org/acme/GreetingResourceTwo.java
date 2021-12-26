package org.acme;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResourceTwo {

    @Inject
    @MyAnnotation
    MyInterface myInterface;

    @Inject
    @Any
    Instance<MyInterface> instanceNew;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        for (MyInterface m : instanceNew) {
            m.draw();
        }
        return "Hello RESTEasy";
    }

    @GET
    @Path("1")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello1() {
        for (MyInterface m : instanceNew) {
            if (m instanceof MyImple)
                m.draw();
        }
        return "Привет";
    }

    @GET
    @Path("2")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        for (MyInterface m : instanceNew) {
            if (m instanceof MyImpleTwo)
                m.draw();
        }
        return "Пока";
    }
}
