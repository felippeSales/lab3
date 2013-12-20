package models;

import java.util.*;

public class CatalogoDisc {
	private List<Disciplina> todasDisciplinas = new ArrayList<Disciplina>();

	public CatalogoDisc() {
		todasDisciplinas.add(new Disciplina("Programacao I", 4));
		todasDisciplinas.add(new Disciplina("Lab. de Programação I", 4));
		todasDisciplinas.add(new Disciplina("Introdução a Computação", 4));
		todasDisciplinas.add(new Disciplina("Leitura e Produção de Textos", 4));
		todasDisciplinas.add(new Disciplina("Cálculo I", 4));
		todasDisciplinas.add(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4));
	}
	
	public List<Disciplina> getCatalogo(){
		return todasDisciplinas;
	}
}
