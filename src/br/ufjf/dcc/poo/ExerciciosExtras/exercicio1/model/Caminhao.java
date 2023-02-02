package br.ufjf.dcc.poo.ExerciciosExtras.exercicio1.model;

public class Caminhao extends Veiculo {
    private float tara;

    public float getTara() {
        return tara;
    }

    public void setTara(float tara) {
        this.tara = tara;
    }

    @Override
    public double calcularConsumo(double precoLitro) {
        return ((this.getCapacidadeTanque()/this.getKmPorLitro())*precoLitro)/this.tara;
    }
}