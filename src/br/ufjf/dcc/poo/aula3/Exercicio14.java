package br.ufjf.dcc.poo.aula3;

import java.util.Scanner;

/*
Exercicio 14
    Desenvolva um programa que calcula a idade média de um grupo de pessoas. A finalização da entrada
    de números é dada por um -1. Usar a FLAG -1;
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = 0, somatorio=0, i=-1;
        float media;

        do {
            somatorio += idade;
            System.out.println("Digite uma idade ou -1 para encerar a execusao");
            idade = scan.nextInt();
            i++;
        }while (idade!= -1);

        if(somatorio > 0){
            media = (float) somatorio / i;
            System.out.println("A media é: "+media);
        }else
            System.out.println("Nenhuma idade passada");
    }
}
