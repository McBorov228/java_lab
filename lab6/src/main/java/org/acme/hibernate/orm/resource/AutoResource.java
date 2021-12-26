package org.acme.hibernate.orm.resource;

import org.acme.hibernate.orm.pojo.Auto;
import org.acme.hibernate.orm.service.AutoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/auto")
public class AutoResource {

    @Inject
    AutoService autoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get")
    public Response getAutos() {
        return Response.ok(autoService.getAuto()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/init")
    public Response getAuto() {
        return Response.ok(autoService.initAuto()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public Response updateFish(Auto auto) {
        return Response.ok(autoService.updateAuto(auto)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/delete")
    public Response deleteFish(Auto auto) {
        return Response.ok(autoService.deleteAuto(auto)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response insertFish(Auto auto) {
        return Response.ok(autoService.insertAuto(auto)).build();
    }

}
