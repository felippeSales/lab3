package controllers;

import models.*;
import play.mvc.*;

public class Application extends Controller {
	
	//Sistema de Planejamento de Disciplinas

	static SPD sistema = new SPD();
	
	public static Result index() {
		return redirect(routes.Application.alocacao());
	}
	
	public static Result alocacao(){
		return ok(views.html.index.render(sistema.getPeriodos()));
		
	}

}
