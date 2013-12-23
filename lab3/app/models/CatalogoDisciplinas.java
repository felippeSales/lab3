package models;

import java.util.*;

public class CatalogoDisciplinas {
	private List<Disciplina> todasDisciplinas = new ArrayList<Disciplina>();

	public CatalogoDisciplinas() {
		todasDisciplinas.add(new Disciplina("Programação I", 4));
		todasDisciplinas.add(new Disciplina("Lab. de Programação I", 4));
		todasDisciplinas.add(new Disciplina("Introdução a Computação", 4));
		todasDisciplinas.add(new Disciplina("Leitura e Produção de Textos", 4));
		todasDisciplinas.add(new Disciplina("Cálculo I", 4));
		todasDisciplinas.add(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4));
		//2periodo
		todasDisciplinas.add(new Disciplina("Cálculo II", 4, listaDePreRequisitos("Cálculo I")));
		todasDisciplinas.add(new Disciplina("Matemática Discreta", 4));
		todasDisciplinas.add(new Disciplina("Programação II", 4, listaDePreRequisitos("Programação I, Lab. de Programação I, Introdução a Computação")));
		todasDisciplinas.add(new Disciplina("Teoria dos Grafos", 2, listaDePreRequisitos("Programação I, Lab. de Programação I")));
		todasDisciplinas.add(new Disciplina("Fund. de Física Clássica", 4, listaDePreRequisitos("Cálculo I, Álgebra Vetorial e Geometria Analítica")));
		todasDisciplinas.add(new Disciplina("Lab. de Programação II", 4, listaDePreRequisitos("Programação I, Lab. de Programação I, Introdução a Computação")));
		//3periodo
		todasDisciplinas.add(new Disciplina("Álgebra Linear", 4, listaDePreRequisitos("Álgebra Vetorial e Geometria Analítica")));
		todasDisciplinas.add(new Disciplina("Probabilidade e Estatística", 4, listaDePreRequisitos("Cálculo II")));
		todasDisciplinas.add(new Disciplina("Teoria da Computação", 4, listaDePreRequisitos("Teoria dos Grafos, Introdução a Computação, Matemática Discreta")));
		todasDisciplinas.add(new Disciplina("Estruturas de Dados e Algoritmos", 4, listaDePreRequisitos("Teoria dos Grafos, Programação II, Lab. de Programação II")));
		todasDisciplinas.add(new Disciplina("Fund. de Física Moderna", 4, listaDePreRequisitos("Cálculo II, Fund. de Física Clássica")));
		todasDisciplinas.add(new Disciplina("Gerência da Informação", 4));
		todasDisciplinas.add(new Disciplina("Lab. de Estruturas de Dados e Algoritmos", 4, listaDePreRequisitos("Teoria dos Grafos, Programação II, Lab. de Programação II")));
		//4periodo
		todasDisciplinas.add(new Disciplina("Métodos Estatísticos", 4, listaDePreRequisitos("Álgebra Linear, Probabilidade e Estatística")));
		todasDisciplinas.add(new Disciplina("Paradigmas de Linguagem de Programação", 2, listaDePreRequisitos("Teoria da Computação, Estruturas de Dados e Algoritmos, Lab. de Estruturas de Dados e Algoritmos")));
		todasDisciplinas.add(new Disciplina("Lógica Matemática", 4, listaDePreRequisitos("Teoria da Computação")));
		todasDisciplinas.add(new Disciplina("Organização e Arquitetura de Computadores I", 4, listaDePreRequisitos("Estruturas de Dados e Algoritmos, Lab. de Estruturas de Dados e Algoritmos, Fund. de Física Moderna")));
		todasDisciplinas.add(new Disciplina("Lab. de Organização e Arquitetura de Computadores I", 4, listaDePreRequisitos("Estruturas de Dados e Algoritmos, Lab. de Estruturas de Dados e Algoritmos, Fund. de Física Moderna")));
		todasDisciplinas.add(new Disciplina("Engenharia de Software I", 4, listaDePreRequisitos("Programação II, Lab. de Programação II, Probabilidade e Estatística")));
		todasDisciplinas.add(new Disciplina("Sistemas de Informação I", 4, listaDePreRequisitos("Gerência da Informação")));
		//5periodo
		todasDisciplinas.add(new Disciplina("Informática e Sociedade", 2));
		todasDisciplinas.add(new Disciplina("Metodologia Científica", 4, listaDePreRequisitos("Métodos Estatísticos")));
		todasDisciplinas.add(new Disciplina("Analises e Tecnicas de Algoritmos", 4, listaDePreRequisitos("Estruturas de Dados e Algoritmos, Lab. de Estruturas de Dados e Algoritmos, Cálculo II, Lógica Matemática")));
		todasDisciplinas.add(new Disciplina("Compiladores", 4, listaDePreRequisitos("Paradigmas de Linguagem de Programação, Organização e Arquitetura de Computadores I, Lab. de Organização e Arquitetura de Computadores I")));
		todasDisciplinas.add(new Disciplina("Redes de Computadores", 4, listaDePreRequisitos("Organização e Arquitetura de Computadores I, Lab. de Organização e Arquitetura de Computadores I")));
		todasDisciplinas.add(new Disciplina("Banco de Dados I", 4, listaDePreRequisitos("Sistemas de Informação I")));
		todasDisciplinas.add(new Disciplina("Sistemas de Informação II", 4, listaDePreRequisitos("Sistemas de Informação I")));
		todasDisciplinas.add(new Disciplina("Lab. de Engenharia de Software", 2, listaDePreRequisitos("Engenharia de Software I")));
		//6periodo
		todasDisciplinas.add(new Disciplina("Sistemas Operacionais", 4, listaDePreRequisitos("Organização e Arquitetura de Computadores I, Lab. de Organização e Arquitetura de Computadores I")));
		todasDisciplinas.add(new Disciplina("Interconexão de Redes de Computadores", 2, listaDePreRequisitos("Redes de Computadores")));
		todasDisciplinas.add(new Disciplina("Lab. de Interconexão de Redes de Computadores", 2, listaDePreRequisitos("Redes de Computadores")));
		todasDisciplinas.add(new Disciplina("Inteligencia Artificial I", 4, listaDePreRequisitos("Analises e Tecnicas de Algoritmos, Paradigmas de Linguagem de Programação, Métodos Estatísticos")));
		todasDisciplinas.add(new Disciplina("Banco de Dados II", 4, listaDePreRequisitos("Banco de Dados I, Sistemas de Informação II")));
		todasDisciplinas.add(new Disciplina("Direito e Cidadania", 4));
		todasDisciplinas.add(new Disciplina("Optativa 1", 4));
		todasDisciplinas.add(new Disciplina("Optativa 2", 4));
		//7periodo
		todasDisciplinas.add(new Disciplina("Métodos e Software Numéricos", 4, listaDePreRequisitos("Álgebra Linear, Analises e Tecnicas de Algoritmos")));
		todasDisciplinas.add(new Disciplina("Avaliação de Desempenho de Sistemas Discretos", 4, listaDePreRequisitos("Probabilidade e Estatística")));
		todasDisciplinas.add(new Disciplina("Projeto em Computação I", 4, listaDePreRequisitos("Lab. de Engenharia de Software, Metodologia Científica")));
		todasDisciplinas.add(new Disciplina("Optativa 3", 4));
		todasDisciplinas.add(new Disciplina("Optativa 4", 4));
		todasDisciplinas.add(new Disciplina("Optativa 5", 4));
		todasDisciplinas.add(new Disciplina("Optativa 6", 4));
		//8periodo
		todasDisciplinas.add(new Disciplina("Projeto em Computação II", 6, listaDePreRequisitos("Projeto em Computação I")));
		todasDisciplinas.add(new Disciplina("Optativa 7", 4));
		todasDisciplinas.add(new Disciplina("Optativa 8", 4));
		todasDisciplinas.add(new Disciplina("Optativa 9", 4));
		todasDisciplinas.add(new Disciplina("Optativa 10", 4));
		todasDisciplinas.add(new Disciplina("Optativa 11", 4));
		
	}
	 
	private List<String> listaDePreRequisitos(String disciplinas) {
		List<String> listaDePreRequisitos = new ArrayList<String>();
		String[] aux = disciplinas.split(", ");
		for (String disciplina : aux) {
			listaDePreRequisitos.add(disciplina);
		}
		return listaDePreRequisitos;
	}


	public List<Disciplina> getCatalogo(){
		return todasDisciplinas;
	}
}
