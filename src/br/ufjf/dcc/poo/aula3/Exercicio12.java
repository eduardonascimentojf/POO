package br.ufjf.dcc.poo.aula3;

import java.util.Scanner;

/*
Exercicio 12
    Os alunos sabem que para Java é necessário repeJr os execícios feitos pelo professor, além daqueles que
    ele passa como extras. Em se tratando da repeJção, dos feitos em laboratório, alguns alunos necessitam
    de refazer 1, 2 ou 3 vezes enquanto outros repetem 4 ou mais vezes.
    • Elaborar um programa que pergunte ao professor quantas vezes a frase “Faça os exercicios novamente."
    precisa ser impressa. O programa deve imprimir a frase conforme a indicação do professor. Para 1 vez,
    escrever a frase uma vez, para duas vezes, escrever a frase duas vezes, e assim por diante.
 */
public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas vezes é para repetir a frase");
        int repeticoes = scan.nextInt();

        for(int i = 0; i < repeticoes; i++)
            System.out.println("Faça os exercicios novamente!");
    }
}
