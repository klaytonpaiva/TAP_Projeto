package br.com.fornelos.entities;

public class Subgrupo {
	
	private int idSubGrupo;
	private String nomeSubgrupo;
	
	public Subgrupo(String nomeSubgrupo) {
		this.nomeSubgrupo  = nomeSubgrupo;
		
	}

	public int getIdGrupo() {
		return idSubGrupo;
	}

	public void setIdGrupo(int idSubGrupo) {
		this.idSubGrupo = idSubGrupo;
	}

	public String getNomeGrupo() {
		return nomeSubgrupo;
	}

	public void setNomeGrupo(String nomeSubgrupo) {
		this.nomeSubgrupo = nomeSubgrupo;
	}

}
