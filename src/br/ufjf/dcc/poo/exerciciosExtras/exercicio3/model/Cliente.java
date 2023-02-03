package br.ufjf.dcc.poo.exerciciosExtras.exercicio3.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    private double limiteCredito;
    private int cartaoCredito;

    private String contato;

    private boolean status;

    private List<Pedido> pedidos;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public int getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(int cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos() {
        this.pedidos = new ArrayList<Pedido>();
    }

    public double verificaCredito(){
        System.out.println("Verifica Credito");
        return 0;
    }
    public int validaCartao(){
        System.out.println("Valida cartão");
        return 0;
    }

}
