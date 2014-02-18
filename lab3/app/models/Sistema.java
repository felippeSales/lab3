package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável pelo controle do sistema
 * 
 */

// Controller: classe principal do sistema, pois ela quem dá as coordenadas para
// as outras.
public class Sistema {
	static private List<Periodo> periodos;
	static private CatalogoDisciplinas catalogo;

	/**
	 * Construtor
	 */
	public Sistema() {
		periodos = new ArrayList<Periodo>();
		catalogo = new CatalogoDisciplinas();
		setPrimeiroPeriodo();

	}

	// Nao trata a excessao pq o primeiro periodo eh sempre default
	private void setPrimeiroPeriodo() {
		Periodo primeiroPeriodo = new Periodo();

		try {
			for (int i = 0; i < 6; i++) {
				primeiroPeriodo.addDisciplina(catalogo.getDisciplinaPorIndice(i));
				catalogo.getDisciplinaPorIndice(i).setAlocada();
			}
			periodos.add(primeiroPeriodo);

		} catch (Exception e) {
		}
	}

	/**
	 * 
	 * @return Retorna os períodos ja criados do sistema
	 */
	public List<Periodo> getPeriodos() {
		return periodos;
	}

	/**
	 * 
	 * @return Retorna a lista de disciplinas do curso
	 */
	public List<Disciplina> getCatalogoDisc() {
		return catalogo.getCatalogo();
	}


	/**
	 * Adiciona uma disciplina em um periodo pelo nome
	 * 
	 * @param periodo
	 *            Numero do periodo
	 * @param nome
	 *            Nome da disciplina
	 * @throws Exception
	 *  
	 */
	public void addDisciplinasPeriodo(int periodo, String nome)
			throws Exception {
		int i = catalogo.disciplinaIndice(nome);

		addDisciplinasPeriodo(periodo, catalogo.getDisciplinaPorIndice(i));
	}

	/**
	 * Adiciona uma disciplina em um periodo pelo disciplina já criada
	 * 
	 * @param periodo
	 *            Numero do periodo
	 * @param nome
	 *            Nome da disciplina
	 * @throws Exception
	 *  
	 */
	public void addDisciplinasPeriodo(int periodo, Disciplina disc)
			throws Exception {
		if (periodos.size() <= periodo) {
			Periodo novoPerido = new Periodo();
			periodos.add(novoPerido);
			addDisciplinasPeriodo(periodo, disc);
		}else{
			int numPr = disc.getNumPreRequisitos(); //numpr significa o numero de pre-requisitos de cada disciplina
			for(int i = 0; i < periodo; i++){
				for(int j = 0; j < periodos.get(i).getDisciplinas().size(); j++){
					if(disc.getPreRequisitos().contains(periodos.get(i).getDisciplinas().get(j).getNome())){
						numPr--;
					}
				}
			}
			if(numPr == 0){
				periodos.get(periodo).addDisciplina(disc);
				disc.setAlocada();
			}else{
				throw new PreRequisitosInsuficientesException();
			}
		}	
	}

	public void removeDisciplinaPeriodo(int periodo, String nome) {
		int i = catalogo.disciplinaIndice(nome);


		if(catalogo.getCatalogo().get(i).getAlocada()){
			catalogo.getCatalogo().get(i).setAlocada();
			periodos.get(periodo).rmDisciplina(nome);

			for(int j = periodo; j < periodos.size(); j++){
				for(int k = 0; k < periodos.get(j).getDisciplinas().size(); k++){
					if(periodos.get(j).getDisciplinas().get(k).getPreRequisitos().contains(nome)){
						removeDisciplinaPeriodo(j, periodos.get(j).getDisciplinas().get(k).getNome() );
						
					}

				}
			}
		}

	}


}
