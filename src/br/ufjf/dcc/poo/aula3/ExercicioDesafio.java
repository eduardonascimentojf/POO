package br.ufjf.dcc.poo.aula3;

import java.util.Scanner;
/*
Exercicio Desafio
    Elaborar um programa que que imprima todos os números primos em um intervalo indicado pelo
    usuário.
 */
public class ExercicioDesafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor do incio do intervalo");
        int inicio = scan.nextInt();
        System.out.println("Valor do final do intervalo");
        int fim = scan.nextInt();
        boolean ePrimo = true;

        for(int numPrimo = inicio; numPrimo < fim; numPrimo++) {
            for(int numero = 2; numero < numPrimo; numero++) {
                if (numPrimo % numero == 0) {
                    ePrimo = false;
                    break;
                }
            }
            if(ePrimo)
                System.out.print(numPrimo + ", ");
            else
                ePrimo = true;
        }

        System.out.println("\n");

    }
}
