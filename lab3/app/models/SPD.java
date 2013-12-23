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

	private void setPrimeiroPeriodo() {
		Periodo primeiroPeriodo = new Periodo();
		for (int i = 0; i < 6; i++) {
			primeiroPeriodo.addDisciplinas(catalogo.getCatalogo().get(i));
		}
		periodos.add(primeiroPeriodo);
		
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

}
