package br.ufjf.dcc.poo.aula4;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int tamanho = 5;
        float[] notas = new float[tamanho];
        String[] nomes = new String[tamanho];
        float media = 0;

        for (int i = 0; i<tamanho;i++ ){

            System.out.println("Informe o nome do aluno "+ (i+1)+": ");
            nomes[i] = teclado.next();
            System.out.println("Informe a nota do " + nomes[i] + ": ");
            notas[i] = teclado.nextFloat();
            media += notas[i];
        }
        media /= tamanho;

        System.out.println("A média dos alunos é: "+ media);

        for (int j = 0; j<tamanho; j++)
            if(notas[j] > media)
                System.out.println("Parabéns " + nomes[j]);

    }
}
