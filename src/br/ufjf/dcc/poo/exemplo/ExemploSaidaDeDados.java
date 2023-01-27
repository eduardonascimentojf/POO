package br.ufjf.dcc.poo.exemplo;

public class ExemploSaidaDeDados {
    public static void main(String[] args) {

        int idade = 18;
        String nome = "Seu Nome";

        System.out.print("Exemplo de saida sem quebra de linha");
        System.out.println("Exemplo de saida com quebra de linha");
        System.out.printf("\"Exemplo de saida com %s de dado", "formato");

        System.out.println("O " + nome + " tem " + idade + " anos!");
        System.out.print("O " + nome + " tem " + idade + " anos!");
        System.out.printf("O %s tem %d anos!",nome, idade );


    }
}
