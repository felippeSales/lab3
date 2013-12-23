package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe que representa os períodos que o aluno irá alocar disciplinas
 * 
 * @author Felipe, Isabelly e Rodrigo (SI - 2013.2)
 * 
 */
public class Periodo {

	// CREATOR: Periodo eh feito de disciplinas e tem o numero total de creditos nele
	private List<Disciplina> disciplinas;
	private int totalCreditos = 0;

	/**
	 * Construtor
	 */

	public Periodo() {
		disciplinas = new ArrayList<Disciplina>();
	}


	/**
	 * Adiciona disciplinas no período
	 * 
	 * @param disc
	 *            Disciplina a ser adicionada
	 * @throws Exception
	 *             Excessão caso o limite de disciplinas ultrapasse o máximo
	 *             permitido (28 creditos)
	 */

	public void addDisciplina(Disciplina disc) throws Exception {
		if (totalCreditos + disc.getCreditos() <= 28) {
			disciplinas.add(disc);
			totalCreditos += disc.getCreditos();
		} else {
			throw new LimitesExcedidosException();
		}
	}

	/**
	 * @return Retorna a lista de disciplinas do período
	 */

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void rmDisciplina(String disc) {
		Iterator it = disciplinas.iterator();
		
		for(int i = 0; it.hasNext(); i++){
			if(disciplinas.get(i).getNome().equals(disc)){
				totalCreditos -= disciplinas.get(i).getCreditos();
						
				disciplinas.remove(i);
				break;
			}
		}
		
		
	}

	/**
	 * 
	 * @return Retorna o total de creditos ja alocados do periodo
	 */
	
	public int getTotalCreditos() {
		return totalCreditos;
	}

}
