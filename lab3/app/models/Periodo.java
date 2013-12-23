package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//O nome da classe eh periodo pq se encaixa no contexto
public class Periodo {

	// CREATOR: Periodo eh feito de disciplinas e tem o numero total de creditos nele
	private List<Disciplina> disciplinas;
	private int totalCreditos = 0;
	
	public Periodo(){
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public void addDisciplina(Disciplina disc) throws Exception{
		if(totalCreditos + disc.getCreditos() <= 28){
			disciplinas.add(disc);
			totalCreditos += disc.getCreditos();
		}else{
			throw new LimitesExcedidosException();
		}
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void rmDisciplina(String disc) {
		Iterator it = disciplinas.iterator();
		
		for(int i = 0; it.hasNext(); i++){
			if(disciplinas.get(i).getNome().equals(disc)){
				disciplinas.remove(i);
				break;
			}
		}
		
		
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public int getTotalCreditos(){
		return totalCreditos;
	}

}
