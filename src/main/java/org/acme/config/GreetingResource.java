package org.acme.config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {

    @Inject
    TodoService todoService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/create")
    @Produces(MediaType.APPLICATION_JSON)
    public String createTodo() {
        todoService.create();
        return "{\"msg\":\"New todo has been created\"}";
    }
}