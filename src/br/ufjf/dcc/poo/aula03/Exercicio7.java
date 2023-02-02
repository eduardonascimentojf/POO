package br.ufjf.dcc.poo.aula03;

import java.util.Scanner;

/*
Exercicio 7
    Desenvolver uma aplicação em Java que faça o sorteio de um número entre 0 e 1000. Pedir um palpite ao usuário.
    Se ele errar, informar se o palpite é maior ou menor do que o número sorteado.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        int randomNum =(int)(Math.random()*100);
        Scanner scan = new Scanner(System.in);
        int numDigitado ;
        numDigitado= scan.nextInt();
        while (numDigitado!= randomNum) {
            if(numDigitado < randomNum)
                System.out.println("O numero digitado é menor que o esperado");
            else
                System.out.println("O numero digitado é maior que o esperado");

            numDigitado = scan.nextInt();
        }
        System.out.println("Acertou o numero");
    }
}
