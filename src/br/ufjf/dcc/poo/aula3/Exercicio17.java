package br.ufjf.dcc.poo.aula3;

import java.util.Scanner;

/*
Exercicio 17
    Elaborar um programa que faça a leitura de uma quantidade de números inteiros e informe quantos
    deles são ímpares.
 */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor ou -1 para sair do programa");
        int numero = scan.nextInt();
        int pares = 0, impares = 0;
        while(numero != -1){
            System.out.println("Digite um valor ou -1 para sair do programa");
            numero = scan.nextInt();
            if(numero %2 == 0)
                pares ++;
            else
                impares++;
        }
        System.out.println("Foi lido " + pares + " numero(s) pare(s)  e " + impares + " numero(s) impare(s)");
    }
}
