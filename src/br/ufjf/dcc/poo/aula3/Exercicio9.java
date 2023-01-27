package br.ufjf.dcc.poo.aula3;

import java.util.Scanner;

/*
Exercicio 9
    • Ler 3 numeros e verificar se eles podem ou não ser lados de um triângulo.
    • Só irá existir um triângulo se, somente se, os seus lados obedeceram à seguinte regra: um de seus lados deve
    ser maior que o valor absoluto (módulo) da diferença dos outros dois lados e menor que a soma dos outros
    dois lados.
    • | b - c | < a < b + c
    • | a - c | < b < a + c
    • | a - b | < c < a + b
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        if( Math.abs(b-c) < a && a < b+c &&
                Math.abs(a-c) < b && b < a+c &&
                Math.abs(a-b)< c && c < a+b)
            System.out.println("Eh um triangulo");

        else
            System.out.println("Não é um triangulo");
    }
}
