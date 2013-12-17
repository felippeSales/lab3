package models;

import java.util.ArrayList;
import java.util.List;

//O nome da classe eh periodo pq se encaixa no contexto
public class Periodo {

	// CREATOR: Periodo eh feito de disciplinas
	private List<Disciplina> disciplinas;

	public Periodo(){
		disciplinas = new ArrayList<Disciplina>();
	}
	
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
