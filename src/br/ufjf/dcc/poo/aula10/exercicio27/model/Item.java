package br.ufjf.dcc.poo.aula10.exercicio27.model;

public class Item {
    private Parte parte;
    private int quantidade;

    public Parte getParte() {
        return parte;
    }

    public void setParte(Parte parte) {
        this.parte = parte;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float calculaValor(){
        System.out.println("Quantidade: "+ this.getQuantidade());
        return this.getQuantidade() * this.getParte().getValor();
    }


}
