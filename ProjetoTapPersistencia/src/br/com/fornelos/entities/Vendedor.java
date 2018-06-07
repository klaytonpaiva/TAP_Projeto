package br.com.fornelos.entities;

public class Vendedor {
	private int idVenddor;
	private String nomeVendedor;
	/**
	 * @param idVenddor
	 * @param nomeVendedor
	 */
	public Vendedor(int idVenddor, String nomeVendedor) {
		super();
		this.idVenddor = idVenddor;
		this.nomeVendedor = nomeVendedor;
	}
	public int getIdVenddor() {
		return idVenddor;
	}
	public void setIdVenddor(int idVenddor) {
		this.idVenddor = idVenddor;
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	
	

}
