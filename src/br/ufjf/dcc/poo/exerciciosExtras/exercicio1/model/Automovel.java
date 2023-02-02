package br.ufjf.dcc.poo.exerciciosExtras.exercicio1.model;

public class Automovel extends Veiculo {

    @Override
    public double calcularConsumo(double precoLitro) {
        return (this.getCapacidadeTanque()/this.getKmPorLitro())*precoLitro;
    }

}