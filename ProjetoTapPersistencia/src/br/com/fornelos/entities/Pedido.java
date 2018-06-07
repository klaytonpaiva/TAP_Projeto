package br.com.fornelos.entities;

public class Pedido {
	private int idpedido;
	private int pessoa_idPessoa;
	private int vendedor_idVendedor;
	/**
	 * @param idpedido
	 * @param pessoa_idPessoa
	 * @param vendedor_idVendedor
	 */
	public Pedido(int idpedido, int pessoa_idPessoa, int vendedor_idVendedor) {
		super();
		this.idpedido = idpedido;
		this.pessoa_idPessoa = pessoa_idPessoa;
		this.vendedor_idVendedor = vendedor_idVendedor;
	}
	public int getIdpedido() {
		return idpedido;
	}
	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}
	public int getPessoa_idPessoa() {
		return pessoa_idPessoa;
	}
	public void setPessoa_idPessoa(int pessoa_idPessoa) {
		this.pessoa_idPessoa = pessoa_idPessoa;
	}
	public int getVendedor_idVendedor() {
		return vendedor_idVendedor;
	}
	public void setVendedor_idVendedor(int vendedor_idVendedor) {
		this.vendedor_idVendedor = vendedor_idVendedor;
	}
	
	

}
