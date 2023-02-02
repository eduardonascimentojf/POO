package br.ufjf.dcc.poo.aula10.exercicio27.model;

public class Parafuso extends Parte {
    private float comprimento;
    private float diametro;

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public void print(){
        System.out.println("Parafuso");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Codigo: "+ this.getCodigo());
        System.out.println("Valor: "+ this.getValor());
        System.out.println("Comprimento: "+ this.getComprimento());
        System.out.println("Diametro: "+ this.getDiametro());

    }
}
