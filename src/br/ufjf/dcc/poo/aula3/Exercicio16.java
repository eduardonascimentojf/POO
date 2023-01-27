package br.ufjf.dcc.poo.aula3;

import java.util.Scanner;

/*
Exercicio 16
    Elaborar um programa que faça a leitura da idade de 10 pessoas e imprima quantas são maiores de
    idade.
 */
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade, adultos = 0;
        for(int i = 0; i<10; i++) {
            idade = scan.nextInt();
            if(idade >= 18)
                adultos++;
        }
        System.out.println("Tem "+ adultos + " adulto(s)");
    }

}
