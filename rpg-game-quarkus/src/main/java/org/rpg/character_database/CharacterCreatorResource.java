package org.rpg.character_database;

import org.rpg.extras.Dice;
import org.rpg.character_classes.Character;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

@Path("/character")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class CharacterCreatorResource {
    private Dice dice;

    @Inject 
    Template create;
    
    // @GET
    // @Produces(MediaType.TEXT_HTML);
    // public TemplateInstance get(@QueryParam("name") string name) {
        
    // }
    @POST
    public Response createCharacter(Character player) {
        try {
            //validate character data and preform necessary operations
            //save character to database

            return Response.status((Response.Status.CREATED)).build();
        }catch(Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
        
    }
}
