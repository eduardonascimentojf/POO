package br.ufjf.dcc.poo.exerciciosExtras.exercicio4.model;

import java.util.Date;

public class CartaoAcesso {
    private int numero;
    private Date dataValidade;
    private Socio socio;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
}
