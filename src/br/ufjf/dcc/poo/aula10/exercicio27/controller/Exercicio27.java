package br.ufjf.dcc.poo.aula10.exercicio27.controller;

import br.ufjf.dcc.poo.aula10.exercicio27.model.Item;
import br.ufjf.dcc.poo.aula10.exercicio27.model.Motor;
import br.ufjf.dcc.poo.aula10.exercicio27.model.Parafuso;

public class Exercicio27 {
    public static void main(String[] args) {
        Parafuso parafuso = new Parafuso();
        parafuso.setNome("Parafuso");
        parafuso.setCodigo(256252);
        parafuso.setValor(Float.parseFloat("0.25"));
        parafuso.setComprimento(Float.parseFloat("0.01"));
        parafuso.setDiametro(Float.parseFloat("0.003"));
        parafuso.print();
        Item itemParafuso = new Item();
        itemParafuso.setParte(parafuso);
        itemParafuso.setQuantidade(40);
        System.out.println("A preço : "+itemParafuso.calculaValor());



        Motor motor = new Motor();
        motor.setNome("Motor");
        motor.setCodigo(823352);
        motor.setValor(Float.parseFloat("2500.00"));
        motor.setPotencia(10);
        motor.setCorrente(Float.parseFloat("45.4"));
        motor.setRpm(3500);
        motor.print();
        Item itemMotor = new Item();
        itemMotor.setParte(motor);
        itemMotor.setQuantidade(2);
        System.out.println("A preço : "+itemMotor.calculaValor());




    }
}
