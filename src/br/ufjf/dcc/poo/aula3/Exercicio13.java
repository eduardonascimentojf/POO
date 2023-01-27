package br.ufjf.dcc.poo.aula3;

import java.util.Scanner;
/*
Exercicio 13
    Desenvolver um programa para ler uma sequência de números inteiros e calcular e imprimir a média
    aritmética dos valores lidos. Usar a FLAG = -1 para terminar a digitação
 */
public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeros = scan.nextInt();
        int somatorio = numeros;
        float media;
        int i = 0;
        System.out.println("Digite um valor ou -1 para encerar a execusao");
        while (numeros != -1) {
            System.out.println("Digite um valor");
            numeros = scan.nextInt();
            somatorio += numeros;
            i++;
        }
        if(i != 0){
            media = (float) somatorio/i;
            System.out.println("A media é: " + media);
        }else
            System.out.println("Nenhum valor passado");

    }
}
