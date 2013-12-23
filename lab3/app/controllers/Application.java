package controllers;

import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

//CREATOR: a classe Periodo guarda objetos do tipo Disciplina
public class Application extends Controller {

	// CONTROLER: SPD eh a classe responsavel por controlar o sistema

	// Sistema de Planejamento de Disciplinas
	static SPD sistema = new SPD();

	private static String erro = "";

	static Form<Disciplina> disciplinaForm = Form.form(Disciplina.class);

	public static Result index() {
		return ok(index.render(sistema.getPeriodos(),
				sistema.getCatalogoDisc(), erro));
	}

	public static Result disciplinaPeriodo() throws Exception {

		try {

			DynamicForm formDisciplina = new DynamicForm();

			final DynamicForm form = formDisciplina.bindFromRequest();
			final String nome = form.get("nome");
			final int periodo = Integer.parseInt(form.get("periodo")) - 1;

			sistema.addDisciplinasPeriodo(periodo, nome);
			
			String aux = "";
			for(int i = 0; i < sistema.getPeriodos().size(); i++){
				if(sistema.getPeriodos().get(i).getTotalCreditos() <= 14 && sistema.getPeriodos().get(i).getTotalCreditos() != 0){
					if( aux.equals("")){
						aux += "Quantidade de créditos insuficientes no: ";
					}
					if(i != sistema.getPeriodos().size() -1){
						aux += (i + 1) + "º,";
					}else{
						aux += (i + 1) + "º.";
					}
				}
			}
			
			return badRequest(index.render(sistema.getPeriodos(),sistema.getCatalogoDisc(),aux));
			

		} catch (LimitesExcedidosException e) {
			return badRequest(index.render(sistema.getPeriodos(),sistema.getCatalogoDisc(), e.getMessage()));
		} catch (PreRequisitosInsuficientesException e) {
			return badRequest(index.render(sistema.getPeriodos(), sistema.getCatalogoDisc(), e.getMessage()));
		}
	}

	public static Result removeDisciplinaPeriodo(){

		DynamicForm formDisciplina = new DynamicForm();

		final DynamicForm form = formDisciplina.bindFromRequest();
		final String nome = form.get("nome");
		final int periodo = Integer.parseInt(form.get("periodo")) ;

		sistema.removeDisciplinaPeriodo(periodo, nome);
		
		return index();
	}
}

