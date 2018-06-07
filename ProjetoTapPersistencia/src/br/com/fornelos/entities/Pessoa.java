package br.com.fornelos.entities;

public class Pessoa {
	private int idPessoa;
	private String nomePessoa;
	private String tipoPessoa;
	
	public Pessoa(String nomePessoa, String tipoPessoa) {
		this.nomePessoa = nomePessoa;
		this.tipoPessoa = tipoPessoa;
		
	}
	
	public Pessoa() {
		
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	
	

}
