package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável pelo controle do sistema
 * 
 * @author Felipe, Isabelly e Rodrigo (SI - 2013.2)
 * 
 */

// Controller: classe principal do sistema, pois ela quem dá as coordenadas para
// as outras.
public class SPD {
	static private List<Periodo> periodos;
	static private CatalogoDisciplinas catalogo;

	/**
	 * Construtor
	 */
	public SPD() {
		periodos = new ArrayList<Periodo>();
		catalogo = new CatalogoDisciplinas();
		setPrimeiroPeriodo();

	}

	// Nao trata a excessao pq o primeiro periodo eh sempre default
	private void setPrimeiroPeriodo() {
		Periodo primeiroPeriodo = new Periodo();

		try {
			for (int i = 0; i < 6; i++) {
				primeiroPeriodo.addDisciplina(catalogo.getCatalogo().get(i));
				catalogo.getCatalogo().get(i).setAlocada();
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


		addDisciplinasPeriodo(periodo, catalogo.getCatalogo().get(i));
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
			periodos.get(periodo).addDisciplina(disc);
			disc.setAlocada();
		}
	}

	public void removeDisciplinaPeriodo(int periodo, String nome) {
		int i = catalogo.disciplinaIndice(nome);
		
		catalogo.getCatalogo().get(i).setAlocada();
		periodos.get(periodo).rmDisciplina(nome);
		
		
	}

}
