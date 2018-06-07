package br.com.fornelos.entities;

public class Apagar {
	private int idPagar;
	private int pessoa_idPessoa;
    private double valorTotal;
    
	/**
	 * @param idPagar
	 * @param pessoa_idPessoa
	 * @param valorTotal
	 */
	public Apagar(int idPagar, int pessoa_idPessoa, double valorTotal) {
		super();
		this.idPagar = idPagar;
		this.pessoa_idPessoa = pessoa_idPessoa;
		this.valorTotal = valorTotal;
	}

	public int getidPagar() {
		return idPagar;
	}

	public void setIdPagar(int idPagar) {
		this.idPagar = idPagar;
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
