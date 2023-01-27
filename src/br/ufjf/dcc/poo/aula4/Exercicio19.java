package br.ufjf.dcc.poo.aula4;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        float [] salario = new float [100];
        int i=-1;

        do {
            System.out.println ("Entre com o valor de salarios:" +1 + " ou -1 para encerrar o programa");
            i++;
            salario[i] = new Scanner(System.in).nextFloat();
        }while ( i<99 || salario[i] != -1 );

        System.out.println ("Informe o valor do reajuste em porcentagem");
        float reajuste = new Scanner(System.in).nextFloat();
        reajuste/=100; //Para a forma decimal, reajuste = reajuste/100;
        for (int y=1; y<(i-1); y++){
            salario[y]= ((reajuste*salario[y]))+ salario[y];
            System.out.println ("Salario(s) com Reajuste:" +  salario[y]);
        }
    }
}
