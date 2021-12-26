package org.acme.hibernate.orm.resource;

import org.acme.hibernate.orm.pojo.Car;
import org.acme.hibernate.orm.service.CarService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cars")
public class CarResource {

    @Inject
    CarService carService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get")
    public Response getCars() {
        return Response.ok(carService.getCar()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/init")
    public Response getCar() {
        return Response.ok(carService.initCar()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public Response updateCar(Car car) {
        return Response.ok(carService.updateCar(car)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/delete")
    public Response deleteCar(Car car) {
        return Response.ok(carService.deleteCar(car)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insert")
    public Response insertCar(Car car) {
        return Response.ok(carService.insertCar(car)).build();
    }

}
