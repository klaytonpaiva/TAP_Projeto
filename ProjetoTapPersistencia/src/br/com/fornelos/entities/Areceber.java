package br.com.fornelos.entities;

public class Areceber {
	private int idReceber;
	private int pessoa_idPessoa;
    private double valorTotal;
	/**
	 * @param idReceber
	 * @param pessoa_idPessoa
	 * @param valorTotal
	 */
	public Areceber(int idReceber, int pessoa_idPessoa, double valorTotal) {
		super();
		this.idReceber = idReceber;
		this.pessoa_idPessoa = pessoa_idPessoa;
		this.valorTotal = valorTotal;
	}
	public int getIdReceber() {
		return idReceber;
	}
	public void setIdReceber(int idReceber) {
		this.idReceber = idReceber;
	}
	public int getPessoa_idPessoa() {
		return pessoa_idPessoa;
	}
	public void setPessoa_idPessoa(int pessoa_idPessoa) {
		this.pessoa_idPessoa = pessoa_idPessoa;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
    

}
