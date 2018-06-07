package br.com.fornelos.entities;

public class ItemPedido {
	private int idItemPedido;
	private int pedido_idPedido;
	private int produto_idProduto;
	private double preco;
	private double quantidade;
	/**
	 * @param idItemPedido
	 * @param pedido_idPedido
	 * @param produto_idProduto
	 * @param preco
	 * @param quantidade
	 */
	public ItemPedido(int idItemPedido, int pedido_idPedido, int produto_idProduto, double preco, double quantidade) {
		super();
		this.idItemPedido = idItemPedido;
		this.pedido_idPedido = pedido_idPedido;
		this.produto_idProduto = produto_idProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public int getIdItemPedido() {
		return idItemPedido;
	}
	public void setIdItemPedido(int idItemPedido) {
		this.idItemPedido = idItemPedido;
	}
	public int getPedido_idPedido() {
		return pedido_idPedido;
	}
	public void setPedido_idPedido(int pedido_idPedido) {
		this.pedido_idPedido = pedido_idPedido;
	}
	public int getProduto_idProduto() {
		return produto_idProduto;
	}
	public void setProduto_idProduto(int produto_idProduto) {
		this.produto_idProduto = produto_idProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
