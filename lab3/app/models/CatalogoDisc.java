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
		todasDisciplinas.add(new Disciplina("Cálculo Diferencial e Integral II", 4));
		todasDisciplinas.add(new Disciplina("Matemática Discreta", 4));
		todasDisciplinas.add(new Disciplina("Programação II", 4));
		todasDisciplinas.add(new Disciplina("Teoria dos Grafos", 2));
		todasDisciplinas.add(new Disciplina("Fundamentos de Física Clássica", 4));
		todasDisciplinas.add(new Disciplina("Lab. de Programação II", 4));
		todasDisciplinas.add(new Disciplina("Álgebra Linear", 4));
		todasDisciplinas.add(new Disciplina("Probabilidade e Estatística", 4));
		todasDisciplinas.add(new Disciplina("Teoria da Computação", 4));
		todasDisciplinas.add(new Disciplina("Estruturas de Dados e Algoritmos", 4));
		todasDisciplinas.add(new Disciplina("Fundamentos de Física Moderna", 4));
		todasDisciplinas.add(new Disciplina("Gerência da Informação", 4));
		todasDisciplinas.add(new Disciplina("Lab. de Estruturas de Dados e Algoritmos", 4));
		
	}
	
	public List<Disciplina> getCatalogo(){
		return todasDisciplinas;
	}
}
