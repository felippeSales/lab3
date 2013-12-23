package models;

import java.util.List;

// O nome da classe eh disciplina pq se encaixa no contexto
public class Disciplina {

	private String nome;
	private int creditos;
	private List<String> preRequisitos;
	private boolean alocada;

	public Disciplina(String nome, int creditos) {
		this.nome = nome;
		this.creditos = creditos;
		alocada = false;
	}

	public String getNome() {
		return nome;
	}

	public int getCreditos() {
		return creditos;
	}

	public List<String> getPreRequisitos() {
		return preRequisitos;
	}

	public boolean getAlocada(){
		return alocada;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	
	
	public void setAlocada(){
		alocada = (alocada == false) ? true : false;
		
	}

	public void setPreRequisitos(List<String> preRequisitos) {
		this.preRequisitos = preRequisitos;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Disciplina) {
			Disciplina compara = (Disciplina) obj;
			if (getNome().equals(compara.getNome()))
				return true;
		}
		return false;
	}

}
