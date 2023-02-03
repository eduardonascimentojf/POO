package br.ufjf.dcc.poo.exerciciosExtras.exercicio4.model;

import java.util.List;

public class Socio {
    private String nome;
    private String matricula;
    private List<Boleto>boletos;
    private List<Veiculo>veiculos;
    private CartaoAcesso cartaoAcesso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public CartaoAcesso getCartaoAcesso() {
        return cartaoAcesso;
    }

    public void setCartaoAcesso(CartaoAcesso cartaoAcesso) {
        this.cartaoAcesso = cartaoAcesso;
    }
}
