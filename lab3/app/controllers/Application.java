package controllers;

import models.*;
import play.mvc.*;

//CREATOR: a classe Periodo guarda objetos do tipo Disciplina
public class Application extends Controller {
	
	//CONTROLER: SPD eh a classe responsavel por controlar o meu sistema

	// Sistema de Planejamento de Disciplinas
	static SPD sistema = new SPD();
	
	public static Result index() {
		return redirect(routes.Application.alocacao());
	}
	
	public static Result alocacao(){
		return ok(views.html.index.render(sistema.getPeriodos(), sistema.getCatalogoDisc()));	
	}
}
