package br.ufjf.dcc.poo.aula09;

public class Exercicio1 {
    public static void main(String[] args) {

        System.out.println("Iniciando uma pilha de inteiros ");
        Pilha<Integer> pilhaInteira = new Pilha<>();

        pilhaInteira.empilhar(10);
        pilhaInteira.empilhar(20);
        pilhaInteira.empilhar(30);

        pilhaInteira.printPilha();
        System.out.println("Numero desempilhado: "+ pilhaInteira.desempilhar());

        pilhaInteira.printPilha();
        System.out.println("Numero desempilhado: "+ pilhaInteira.desempilhar());
        System.out.println("Eh vazia "+ pilhaInteira.ehVazia());

        pilhaInteira.printPilha();
        System.out.println("Numero desempilhado: "+ pilhaInteira.desempilhar());
        pilhaInteira.printPilha();
        System.out.println("Eh vazia "+ pilhaInteira.ehVazia());

        System.out.println("Numero desempilhado: "+ pilhaInteira.desempilhar());
        pilhaInteira.printPilha();
        System.out.println("Eh vazia "+ pilhaInteira.ehVazia());

        System.out.println("Iniciando uma pilha de strings ");
        Pilha<String> pilhaString = new Pilha<>();

        pilhaString.empilhar("Teste 1");
        pilhaString.empilhar("Teste 2");
        pilhaString.empilhar("Teste 3");

        pilhaString.printPilha();
        System.out.println("Numero desempilhado: "+ pilhaString.desempilhar());

        pilhaString.printPilha();
        System.out.println("Numero desempilhado: "+ pilhaString.desempilhar());
        System.out.println("Eh vazia "+ pilhaString.ehVazia());

        pilhaString.printPilha();
        System.out.println("Numero desempilhado: "+ pilhaString.desempilhar());
        pilhaString.printPilha();
        System.out.println("Eh vazia "+ pilhaString.ehVazia());

        System.out.println("Numero desempilhado: "+ pilhaString.desempilhar());
        pilhaString.printPilha();
        System.out.println("Eh vazia "+ pilhaString.ehVazia());
    }
}
