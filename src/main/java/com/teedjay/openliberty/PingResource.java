package com.teedjay.openliberty;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.TEXT_PLAIN)
@Path("/ping")
public class PingResource {

    @GET
    public String ping() {
        return "pong";
    }

    @GET
    @Path("{message}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response ping(@PathParam("message") String message) {
        JsonObject jo = Json.createObjectBuilder()
                .add("message", message)
                .add("reverse", new StringBuffer(message).reverse().toString())
                .build();
        return Response.ok(jo).build();
    }

}
