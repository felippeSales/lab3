package models;

import java.util.List;

public class Disciplina {
	private String nome;
	private int creditos;
	private List<String> preRequisitos;
	
	public String getNome() {
		return nome;
	}
	public int getCreditos() {
		return creditos;
	}
	public List<String> getPreRequisitos() {
		return preRequisitos;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public void setPreRequisitos(List<String> preRequisitos) {
		this.preRequisitos = preRequisitos;
	}

}
