package models;

import java.util.List;

import play.data.*;

import play.data.validation.Constraints.*;

// O nome da classe eh disciplina pq se encaixa no contexto
public class Disciplina {

	@Required
	private String nome;
	
	@Required
	private int periodo;
	
	private int creditos;
	private List<String> preRequisitos;
	private boolean alocada;
	
	
	public Disciplina(){}
	
	// Contrutor para disciplinas sem preRequisitos
	public Disciplina(String nome, int creditos) {
		this.nome = nome;
		this.creditos = creditos;
		alocada = false;
	}
	
	// Contrutor para disciplinas com preRequisitos
	public Disciplina(String nome, int creditos, List<String> preRequesitos) {
		this.nome = nome;
		this.creditos = creditos;
		alocada = false;
		this.preRequisitos= preRequesitos;
	}

	public String getNome() {
		return nome;
	}

	public int getCreditos() {
		return creditos;
	}
	
	public void addPreRequisito(String pr){
		preRequisitos.add(pr);
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
	
	public int getPeriodo(){
		return this.periodo;
	}
	
	public void setPeriodo(int p){
		this.periodo = p;
	}
	
	

}
