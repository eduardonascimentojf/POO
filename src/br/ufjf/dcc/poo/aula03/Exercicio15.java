package br.ufjf.dcc.poo.aula03;

import java.util.Scanner;

/*
Exercicio 15
    Elaborar um programa que que imprima todos os valores inteiros em um intervalo indicado pelo usuário.

 */
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor do incio do intervalo");
        int inicio = scan.nextInt();
        System.out.println("Valor do final do intervalo");
        int fim = scan.nextInt();


        for(int i = inicio; i < fim; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\n");

    }
}
