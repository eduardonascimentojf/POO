package br.ufjf.dcc.poo.aula12;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean  validos = false;
        int n1=0, n2=0, soma=0;

        while (!validos) {
            try {
                System.out.print("Informe o primeiro valor: ");
                n1 = Integer.parseInt(entrada.nextLine());
                System.out.print("Informe o segundo valor: ");
                n2 = Integer.parseInt(entrada.nextLine());
                soma = n1+n2;
                validos = true;

            } catch (Exception e) {
                System.out.println("Dados invalidos: "+ e);
                System.out.println("Por favor, informe os dois numeros novamente");
            }
        }
        System.out.printf("A soma entre %d e %d é igual %d\n", n1,n2,soma);
    }
}
