package br.ufjf.dcc.poo.aula03;

import java.util.Scanner;

/*
Exercicio 8
    Elabore um programa que receba como entrada a idade de uma pessoa (valor inteiro) e imprima:
    • se idade ≤ 3 : “Bebê”;
    • se idade > 3 e idade ≤ 13 : “Criança”;
    • se idade> 13 e < 20 : “Adolescente”;
    • se 20 ≤ idade < 65 : “Adulto”;
    • se idade ≥ 65 : “Idoso”.
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();

        if(idade<= 3)
            System.out.println("Bebê");
        else if (idade <= 13)
            System.out.println("Criança");
        else if(idade < 20)
            System.out.println("Adolescente");
        else if (idade < 65)
            System.out.println("Adulto");
        else
            System.out.println("Idoso");
    }
}
