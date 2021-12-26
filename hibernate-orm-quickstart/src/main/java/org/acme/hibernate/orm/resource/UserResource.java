package org.acme.hibernate.orm.resource;

import org.acme.hibernate.orm.pojo.User;
import org.acme.hibernate.orm.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserResource {

    @Inject
    UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get")
    public Response getUsers() {
        return Response.ok(userService.getUser()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/init")
    public Response getUser() {
        return Response.ok(userService.initUser()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public Response updateUser(User user) {
        return Response.ok(userService.updateUser(user)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/delete")
    public Response deleteUser(User user) {
        return Response.ok(userService.deleteUser(user)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response insertUser(User user) {
        return Response.ok(userService.insertUser(user)).build();
    }

}
