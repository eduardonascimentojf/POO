package br.ufjf.dcc.poo.aula10.exercicioInterfaces;

public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal("Pastor Alemão");
        animal.mover();
        animal.comer(25);
        animal.informacao();

    }
}
