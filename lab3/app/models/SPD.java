package models;

import java.util.ArrayList;
import java.util.List;

public class SPD {
	private List<Periodo> periodos;
	private CatalogoDisciplinas catalogo;

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
				primeiroPeriodo.addDisciplinas(catalogo.getCatalogo().get(i));
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
	
	public void addDisciplinasPeriodo(int periodo, Disciplina disc)throws Exception{
		
		if(periodos.size() < periodo + 1){
			Periodo novoPerido = new Periodo();
			periodos.add(novoPerido);
			addDisciplinasPeriodo(periodo, disc);
		}else{
			periodos.get(periodo).addDisciplinas(disc);
		}
	}

}
