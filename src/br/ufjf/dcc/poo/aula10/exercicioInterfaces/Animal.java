package br.ufjf.dcc.poo.aula10.exercicioInterfaces;

public class Animal implements SerVivo {
    private final String especie;
    public Animal(String _especie){
        this.especie = _especie;
    }
    @Override
    public void mover() {
        System.out.println("Exemplo para teste do metodo mover");

    }
    @Override
    public void comer(float massa) {
        System.out.println("Exemplo para teste do metodo comer " + massa);
    }
    @Override
    public void informacao() {
        System.out.println("Exemplo para teste do metodo informacao da espécie "+this.especie);
    }

}
