package org.acme.getting.started;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@ApplicationScoped
public class GreetingResource {

    @Inject
    SantaClausService santaClausService;

    @ConfigProperty(name = "overrideable.property")
    String msg;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        santaClausService.createGift("Another gift");
        return "This is " + msg;
    }
}