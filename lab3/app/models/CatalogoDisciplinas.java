package models;

import java.util.ArrayList;
import java.util.List;

// CREATOR: Guarda objetos do tipo Disciplina
public class CatalogoDisciplinas {

	private List<Disciplina> todasDisciplinas = new ArrayList<Disciplina>();

	public CatalogoDisciplinas() {
		todasDisciplinas.add(new Disciplina("Programaçãoo I", 4));
		todasDisciplinas.add(new Disciplina("Lab. de Programação I", 4));
		todasDisciplinas.add(new Disciplina("Introdução a Computação", 4));
		todasDisciplinas.add(new Disciplina("Leitura e Produção de Textos", 4));
		todasDisciplinas.add(new Disciplina("Cálculo I", 4));
		todasDisciplinas.add(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4));
		
		
		//2periodo
		
		todasDisciplinas.add(new Disciplina("Cálculo Diferencial e Integral II", 4));
		todasDisciplinas.add(new Disciplina("Matemática Discreta", 4));
		todasDisciplinas.add(new Disciplina("Programação II", 4));
		todasDisciplinas.add(new Disciplina("Teoria dos Grafos", 2));
		todasDisciplinas.add(new Disciplina("Fundamentos de Física Clássica", 4));
		todasDisciplinas.add(new Disciplina("Lab. de Programação II", 4));
		//3periodo
		todasDisciplinas.add(new Disciplina("Álgebra Linear", 4));
		todasDisciplinas.add(new Disciplina("Probabilidade e Estatística", 4));
		todasDisciplinas.add(new Disciplina("Teoria da Computação", 4));
		todasDisciplinas.add(new Disciplina("Estruturas de Dados e Algoritmos", 4));
		todasDisciplinas.add(new Disciplina("Fundamentos de Física Moderna", 4));
		todasDisciplinas.add(new Disciplina("Gerência da Informação", 4));
		todasDisciplinas.add(new Disciplina("Lab. de Estruturas de Dados e Algoritmos", 4));
		//4periodo
		todasDisciplinas.add(new Disciplina("Métodos Estatísticos", 4));
		todasDisciplinas.add(new Disciplina("Paradigmas de Linguagem de Programação", 2));
		todasDisciplinas.add(new Disciplina("Lógica Matemática", 4));
		todasDisciplinas.add(new Disciplina("Organização e Arquitetura de Computadores I", 4));
		todasDisciplinas.add(new Disciplina("Lab. de Organização e Arquitetura de Computadores I", 4));
		todasDisciplinas.add(new Disciplina("Engenharia de Software", 4));
		todasDisciplinas.add(new Disciplina("Sistemas de Informação I", 4));
	
		//5periodo
		todasDisciplinas.add(new Disciplina("Informática e Sociedade", 2));
		todasDisciplinas.add(new Disciplina("Analises e Tecnicas de Algoritmos	", 4));
		todasDisciplinas.add(new Disciplina("Compiladores", 4));
		todasDisciplinas.add(new Disciplina("Redes de Computadores", 4));
		todasDisciplinas.add(new Disciplina("Banco de Dados I", 4));
		todasDisciplinas.add(new Disciplina("Sistemas de Informação II", 4));
		todasDisciplinas.add(new Disciplina("Lab. de Engenharia de Software", 2));
		//6periodo
		todasDisciplinas.add(new Disciplina("Sistemas Operacionais", 4));
		todasDisciplinas.add(new Disciplina("Interconexão de Redes de Computadores", 2));
		todasDisciplinas.add(new Disciplina("Lab. de Interconexão de Redes de Computadores", 2));
		todasDisciplinas.add(new Disciplina("Inteligencia Artificial I", 4));
		todasDisciplinas.add(new Disciplina("Banco de Dados II", 4));
		todasDisciplinas.add(new Disciplina("Optativa 1", 4));
		todasDisciplinas.add(new Disciplina("Optativa 2", 4));
		//7periodo
		todasDisciplinas.add(new Disciplina("Métodos e Software Numéricos", 4));
		todasDisciplinas.add(new Disciplina("Avaliação de Desempenho de Sistemas Discretos", 4));
		todasDisciplinas.add(new Disciplina("Projeto em Computação I", 4));
		todasDisciplinas.add(new Disciplina("Optativa 3", 4));
		todasDisciplinas.add(new Disciplina("Optativa 4", 4));
		todasDisciplinas.add(new Disciplina("Optativa 5", 4));
		todasDisciplinas.add(new Disciplina("Optativa 6", 4));
		//8periodo
		todasDisciplinas.add(new Disciplina("Projeto em Computação II", 6));
		todasDisciplinas.add(new Disciplina("Optativa 7", 4));
		todasDisciplinas.add(new Disciplina("Optativa 8", 4));
		todasDisciplinas.add(new Disciplina("Optativa 9", 4));
		todasDisciplinas.add(new Disciplina("Optativa 10", 4));
		todasDisciplinas.add(new Disciplina("Optativa 11", 4));
		

	}

	public List<Disciplina> getCatalogo(){
		return todasDisciplinas;
	}
}
