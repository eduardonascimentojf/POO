package ufjf.dcc.poo.aula1;

import java.util.Scanner;

/*
Exercicio 3
    Escrever um algoritmo que leia os coeficientes de uma equação de 2o grau. A
    seguir, calcula e exibe as raízes;
 */
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);
        System.out.println("Digite o valor do coeficiente a:");
        int a =  scan.nextInt();
        System.out.println("Digite o valor do coeficiente b:");
        int b =  scan.nextInt();
        System.out.println("Digite o valor do coeficiente c:");
        int c =  scan.nextInt();

        int delta = (int) Math.pow(b,2) - (4*a*c);
        System.out.println("O delta é: " + delta);

        double raiz1 = (-b + Math.sqrt(delta))/ (2*a);
        double raiz2 = (-b - Math.sqrt(delta))/ (2*a);

        System.out.println("As raizes são Raiz1: "+ raiz1 + " e Raiz 2 "+ raiz2);
    }
}
