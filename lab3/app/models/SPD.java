package models;

import java.util.ArrayList;
import java.util.List;

public class SPD {
	private List<Periodo> periodos;
	private CatalogoDisc catalogo;

	public SPD() {
		periodos = new ArrayList<Periodo>();
		catalogo = new CatalogoDisc();
		setPrimeiroPeriodo();

	}

	private void setPrimeiroPeriodo() {
		Periodo p = new Periodo();
		for (int i = 0; i < catalogo.getCatalogo().size(); i++) {
			p.addDisciplinas(catalogo.getCatalogo().get(i));
		}
		periodos.add(p);
	}
	
	public List<Periodo> getPeriodos() {
		return periodos;
	}

	public void setPeriodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}

}
