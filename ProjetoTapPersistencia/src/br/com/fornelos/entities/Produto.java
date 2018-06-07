package br.com.fornelos.entities;

public class Produto {
	private int idProdudo;
	private String nomeProduto;
	private String referenciaProduto;
	private double preco;
	private double estoque;
	private int grupo_idGrupo;
	private int subgrupo_idSubgrupo;
	private int unidade_idunidade;

	/**
	 * @param nomeProduto
	 * @param grupo_idGrupo
	 * @param subgrupo_idSubgrupo
	 * @param unidade_idunidade
	 * @param referenciaProduto
	 * @param preco
	 * @param estoque
	 */
	public Produto(String nomeProduto, int grupo_idGrupo, int subgrupo_idSubgrupo, int unidade_idunidade,
			String referenciaProduto, double preco, double estoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.grupo_idGrupo = grupo_idGrupo;
		this.subgrupo_idSubgrupo = subgrupo_idSubgrupo;
		this.unidade_idunidade = unidade_idunidade;
		this.referenciaProduto = referenciaProduto;
		this.preco = preco;
		this.estoque = estoque;
	}
	public int getIdProdudo() {
		return idProdudo;
	}
	public void setIdProdudo(int idProdudo) {
		this.idProdudo = idProdudo;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getGrupo_idGrupo() {
		return grupo_idGrupo;
	}
	public void setGrupo_idGrupo(int grupo_idGrupo) {
		this.grupo_idGrupo = grupo_idGrupo;
	}
	public int getSubgrupo_idSubgrupo() {
		return subgrupo_idSubgrupo;
	}
	public void setSubgrupo_idSubgrupo(int subgrupo_idSubgrupo) {
		this.subgrupo_idSubgrupo = subgrupo_idSubgrupo;
	}
	public int getUnidade_idunidade() {
		return unidade_idunidade;
	}
	public void setUnidade_idunidade(int unidade_idunidade) {
		this.unidade_idunidade = unidade_idunidade;
	}
	public String getReferenciaProduto() {
		return referenciaProduto;
	}
	public void setReferenciaProduto(String referenciaProduto) {
		this.referenciaProduto = referenciaProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getEstoque() {
		return estoque;
	}
	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}



}
