package br.com.fornelos.entities;

public class Grupo {
	private int idGrupo;
	private String nomeGrupo;
	
	public Grupo(String nomeGrupo) {
		this.nomeGrupo  = nomeGrupo;
		
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNomeGrupo() {
		return nomeGrupo;
	}

	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}
	

}
