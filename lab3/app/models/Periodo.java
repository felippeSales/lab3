package models;

import java.util.ArrayList;
import java.util.List;

//O nome da classe eh periodo pq se encaixa no contexto
public class Periodo {

	// CREATOR: Periodo eh feito de disciplinas e tem o numero total de créditos nele
	private List<Disciplina> disciplinas;
	private int totalCreditos = 0;
	
	public Periodo(){
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public void addDisciplinas(Disciplina disc) {
		disciplinas.add(disc);
		totalCreditos += disc.getCreditos();
	}
	
	
	//CREATOR: a classe Periodo guarda objetos do tipo Disciplina
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public int getTotalCreditos(){
		return totalCreditos;
	}
	
	

		
}
