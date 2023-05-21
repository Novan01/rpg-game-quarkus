package org.rpg.menus;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;


@Path("/main")
@RegisterForReflection
public class MainMenuResource {
	
	@GET
	public String getMenu() {
		String menu = "RPG Game Main Menu\n";
		menu += "1. Play\n";
		menu += "2. New Character\n";
		menu += "3. Exit\n";
		return menu;

	}

}
