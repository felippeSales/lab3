package models;

import java.util.ArrayList;
import java.util.List;


public class SPD{
	static private List<Periodo> periodos;
	static private CatalogoDisciplinas catalogo;
	
	
	public SPD() {
		periodos = new ArrayList<Periodo>();
		catalogo = new CatalogoDisciplinas();
		setPrimeiroPeriodo();

	}
	
// Nao trata a excessao pq o primeiro periodo e sempre default
	private void setPrimeiroPeriodo() {
		Periodo primeiroPeriodo = new Periodo();

		try{
			for (int i = 0; i < 6; i++) {
				primeiroPeriodo.addDisciplina(catalogo.getCatalogo().get(i));
				catalogo.getCatalogo().get(i).setAlocada();
			}
			periodos.add(primeiroPeriodo);
			
		}catch(Exception e){}
	}

	public List<Periodo> getPeriodos() {
		return periodos;
	}

	public void setPeriodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}

	public List<Disciplina> getCatalogoDisc(){
		return catalogo.getCatalogo();
	}
	
	public void addDisciplinaPeriodo(int periodo, String nome)throws Exception{
		int i = catalogo.disciplinaIndice(nome);
		
		addDisciplinasPeriodo(periodo, catalogo.getCatalogo().get(i));
	}
	
	public void addDisciplinasPeriodo(int periodo, Disciplina disc)throws Exception{
		
		if(periodos.size() <= periodo ){
			Periodo novoPerido = new Periodo();
			periodos.add(novoPerido);
			addDisciplinasPeriodo(periodo, disc);
		}else{
			periodos.get(periodo).addDisciplina(disc);
			disc.setAlocada();
		}
	}

	public void removeDisciplinaPeriodo(int periodo, String nome) {
		int i = catalogo.disciplinaIndice(nome);
		
		catalogo.getCatalogo().get(i).setAlocada();
		periodos.get(i).rmDisciplina(nome);
		
		
	}

}
