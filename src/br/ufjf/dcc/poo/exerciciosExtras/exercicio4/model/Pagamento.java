package br.ufjf.dcc.poo.exerciciosExtras.exercicio4.model;

import java.util.Date;

public class Pagamento {
    private int numeroBanco;
    private Date data;
    private Boleto boleto;

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }
}
