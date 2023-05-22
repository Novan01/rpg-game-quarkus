package org.rpg.menus;

import java.io.InputStream;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Produces;


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

	@GET
	@Produces(MediaType.TEXT_HTML)
	public InputStream getMainMenuPage() {
		InputStream is = getClass().getClassLoader().getResourceAsStream("main_menu.html");
		return is;
	}

}
