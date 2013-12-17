package controllers;

import models.*;
import play.mvc.*;

public class Application extends Controller {
	
	//Sistema de Planejamento de Disciplinas
	
	//CONTROLER: SPD eh a classe responsavel por controlar o meu sistema

	//CREATOR: a classe Application usa a classe sistema

	static SPD sistema = new SPD();
	
	public static Result index() {
		return redirect(routes.Application.alocacao());
	}
	
	public static Result alocacao(){
		return ok(views.html.index.render(sistema.getPeriodos()));
		
	}

}
