package controllers;

import models.*;
import play.mvc.*;

public class Application extends Controller {
	
	//Sistema de Planejamento de Disciplinas
<<<<<<< HEAD
	
	//CONTROLER: SPD eh a classe responsavel por controlar o meu sistema
=======
	//CREATOR: a classe Application usa a classe sistema
>>>>>>> dd294bdc090b947c9900b10db166b1564351eb20
	static SPD sistema = new SPD();
	
	public static Result index() {
		return redirect(routes.Application.alocacao());
	}
	
	public static Result alocacao(){
		return ok(views.html.index.render(sistema.getPeriodos()));
		
	}

}
