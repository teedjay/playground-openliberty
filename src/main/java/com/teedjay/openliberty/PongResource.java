package com.teedjay.openliberty;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pong")
public class PongResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN + "; charset=utf-8")
    public String pong() {
        return "Tekst fra PongResource.java som ble lagt til og hot deployed mens serveren var kjørende.";
    }

    @GET
    @Path("{message}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response complexPong(@PathParam("message") String message) {
        JsonObject jo = Json.createObjectBuilder()
                .add("message", message)
                .add("currentTimeMillis", System.currentTimeMillis())
                .build();
        return Response.ok(jo).build();
    }

}
