package br.com.fornelos.entities;

public class Unidade {
	private int idUnidade;
	private String nomeUnidade;
	private String sigla;
	
	
	public Unidade(String nomeUnidade, String sigla) {
		this.nomeUnidade = nomeUnidade;
		this.sigla = sigla;
	}
	
	
	public int getIdUnidade() {
		return idUnidade;
	}
	public void setIdUnidade(int idUnidade) {
		this.idUnidade = idUnidade;
	}
	public String getNomeUnidade() {
		return nomeUnidade;
	}
	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
