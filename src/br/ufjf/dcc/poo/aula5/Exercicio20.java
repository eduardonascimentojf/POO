package br.ufjf.dcc.poo.aula5;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();
        Pessoa pessoa5 = new Pessoa();
        Pessoa [] pessoa = new Pessoa[]{pessoa1, pessoa2, pessoa3, pessoa4, pessoa5};

        for (int i = 0; i<5; i++){
            System.out.println("Informe o nome");
            pessoa[i].setNome(scan.next());
            System.out.println("Informe a idade");
            pessoa[i].setIdade(scan.nextInt());
            System.out.println("Informe o sexo");
            pessoa[i].setSexo(scan.next());
        }

        for (int j = 0; j<5; j++){
            System.out.println("Pessoa "+(j+1));
            pessoa[j].imprimirPessoa();
        }

    }
}
