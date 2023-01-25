package ufjf.dcc.poo.aula1;

import java.util.Scanner;

/*
Exercicio 1
    Construir um algoritmo que leia 3 valores, calcule a média e escreva o
    resultado na tela.

 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor 1");
        float valor1 = scan.nextFloat();
        System.out.println("Informe o valor 2");
        float valor2 = scan.nextFloat();
        System.out.println("Informe o valor 3");
        float valor3 = scan.nextFloat();

        float media = (valor1 + valor2 + valor3) /3;

        System.out.printf("A media entre os valores %f, %f e %f eh de: %.2f  ", valor1, valor2, valor3, media);


    }
}
