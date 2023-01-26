package br.ufjf.dcc.poo.aula1;

import java.util.Scanner;
/*
Exercicio 2
    Escrever um algoritmo que leia as medidas de um terreno retangular e de
    uma casa retangular sobre este terreno. A seguir, calcula e exibe o percentual
    de área livre no terreno.
 */
public class Exercicio2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o comprimento do terreno");
        float compTerreno = scan.nextFloat();

        System.out.println("Informe a profundidade do terreno");
        float profTerreno = scan.nextFloat();

        float areaTerreno = compTerreno * profTerreno;

        System.out.println("Informe o comprimento do casa");
        float compCasa = scan.nextFloat();
        System.out.println("Informe a profundidade do casa");

        float profCasa = scan.nextFloat();

        float areaCasa = compCasa * profCasa;

        float areaLivre = areaTerreno - areaCasa;
        float areaLivrePorcentagem = (areaLivre*100)/areaTerreno;

        System.out.println("A area livre no terreno é de: " + areaLivre + " e " + areaLivrePorcentagem + "%");
    }
}

