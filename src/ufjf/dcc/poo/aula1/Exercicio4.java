package ufjf.dcc.poo.aula1;

import java.util.Scanner;

/*
 Exercicio 4
     Faça um programa para, a partir de um valor informado, indicar a menor quantidade de
    moedas que representa esse valor
        • Considere moedas de 5, 10, 25 e 50 centavos, e 1 real
        • Exemplo: para o valor 290 centavos, a menor quantidade de moedas é 2 moedas de 1
        real, 1 moeda de 50 centavos, 1 moeda de 25 centavos, 1 moeda de 10 centavos e 1
        moeda de 5 centavos
  */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor do troco em centavos");
        int troco = scan.nextInt();
        int moeda1real , moeda50cent, moeda25cent,moeda10cent,moeda5cent,moeda1cent, trocoAux;
        moeda1real = moeda50cent = moeda25cent = moeda10cent = moeda5cent = 0;
        trocoAux =troco;
        if(troco >= 100) {
            moeda1real = troco/100;
            troco = troco % 100;
        }
        if(troco >= 50) {
            moeda50cent = troco/50;
            troco = troco % 50;
        }
        if(troco >= 25) {
            moeda25cent = troco/25;
            troco = troco % 25;
        }
        if(troco >= 10) {
            moeda10cent = troco/10;
            troco = troco % 10;
        }
        if(troco >= 5) {
            moeda5cent = troco/5;
            troco = troco % 5;
        }

        moeda1cent = troco;

        System.out.printf("para o valor %d centavos, a menor quantidade de moedas é %d moedas de 1 real, " +
                "%d moeda de 50 centavos, %d moeda de 25 centavos, %d moeda de 10 centavos e %d moeda de 5 centavos" +
                " e %d moeda de 1 centavo",
                trocoAux, moeda1real, moeda50cent,moeda25cent,moeda10cent,moeda5cent, moeda1cent);
    }
}
