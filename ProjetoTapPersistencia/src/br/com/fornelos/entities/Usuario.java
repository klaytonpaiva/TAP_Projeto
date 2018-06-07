package br.com.fornelos.entities;

public class Usuario {
	private int idUsuario;
	private String nomeUsuario;
	private String poderUsuario;
	private String senha;


	/**
	 * @param idUsuario
	 * @param nomeUsuario
	 * @param poderUsuario
	 * @param senha
	 */
	public Usuario(String nomeUsuario, String poderUsuario, String senha) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.poderUsuario = poderUsuario;
		this.senha = senha;
	}
	
	public Usuario() {
		
	}

	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getPoderUsuario() {
		return poderUsuario;
	}
	public void setPoderUsuario(String poderUsuario) {
		this.poderUsuario = poderUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}



}
