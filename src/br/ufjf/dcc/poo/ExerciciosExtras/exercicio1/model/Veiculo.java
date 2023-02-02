package br.ufjf.dcc.poo.ExerciciosExtras.exercicio1.model;

public abstract class Veiculo {
    private String marca;
    private float capacidadeTanque;
    private float kmPorLitro;

    public double calcularConsumo(double precoLitro) {
        return 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public float getKmPorLitro() {
        return kmPorLitro;
    }

    public void setKmPorLitro(float kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }



}