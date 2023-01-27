package br.ufjf.dcc.poo.aula3;

import java.util.Scanner;

/*
    Elabore um programa que receba como entrada um número inteiro representando um dia da semana e
    imprima o seu respectivo nome por extenso.
    • Considere:
    • 1 - domingo;
    • 2 - segunda;
    • Etc.
    • Caso o número não corresponda a um dia da semana, exibir a mensagem “Dia da semana inválido”.
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um dia da semana em forma de numero");
        int dia_da_semana = scan.nextInt();

        switch (dia_da_semana){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Dia da semana inválido");

        }
    }
}
