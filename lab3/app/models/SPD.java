package models;

import java.util.ArrayList;
import java.util.List;

public class SPD {
	private List<Periodo> periodos;

	public SPD() {
		periodos = new ArrayList<Periodo>();
		setPrimeiroPeriodo();

	}

	private void setPrimeiroPeriodo() {
		Periodo p = new Periodo();
		p.addDisciplinas(new Disciplina("Programacao I", 4));
		p.addDisciplinas(new Disciplina("Lab. de Programação I", 4));
		p.addDisciplinas(new Disciplina("Introdução a Computação", 4));
		p.addDisciplinas(new Disciplina("Leitura e Produção de Textos", 4));
		p.addDisciplinas(new Disciplina("Cálculo I", 4));
		p.addDisciplinas(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4));
		periodos.add(p);
	}
	
	public List<Periodo> getPeriodos() {
		return periodos;
	}

	public void setPeriodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}

}
