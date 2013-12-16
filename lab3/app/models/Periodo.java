package models;

import java.util.ArrayList;
import java.util.List;

public class Periodo {
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void addDisciplinas(Disciplina disc) {
		disciplinas.add(disc);
	}
	
	
	
	//CREATOR: a classe Periodo guarda objetos do tipo Disciplina
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

		
}
