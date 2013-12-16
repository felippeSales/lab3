package models;

import java.util.List;

//O nome da classe eh periodo pq se encaixa no contexto
public class Periodo {
	
	// CREATOR: Periodo eh feito de disciplinas
	private List<Disciplina> disciplinas;

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
}
