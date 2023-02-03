package br.ufjf.dcc.poo.exerciciosExtras.exercicio3.model;

import java.util.List;

public class Produto {
    private String nome;
    private int peso;
    private int qtdeDisponivel;
    private List<ItenPedido> itensPedidos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }
    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }
    public List<ItenPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItenPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    public Produto consultarProduto(){
        System.out.println("Consultar Produto");
        return new Produto();
    }
}
