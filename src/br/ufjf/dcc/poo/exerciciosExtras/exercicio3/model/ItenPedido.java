package br.ufjf.dcc.poo.exerciciosExtras.exercicio3.model;

public class ItenPedido {

    private int quantidade;
    private double preco;
    private Pedido pedido;
    private Produto produto;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int incluirItem(){
        System.out.println("Incluir Item");
        return 0;
    }
    public int excluirItem(){
        System.out.println("Excluir Item");
        return 0;
    }
}
