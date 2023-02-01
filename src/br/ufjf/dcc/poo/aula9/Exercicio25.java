
package br.ufjf.dcc.poo.aula9;

public class Exercicio25 {
    public static void main(String[] args) {
        System.out.println("Iniciando uma Tupla de inteiros e string ");
        Tupla<Integer, String> tupla = new Tupla<>();
        TuplaProps<Integer, String> tuplaProps;
        tupla.adicionar(10, "Teste 10");
        tupla.adicionar(20, "Teste 20");
        tupla.adicionar(30, "Teste 30");

        tupla.printTupla();
        tuplaProps = tupla.remover(10);
        if (tuplaProps != null)
            System.out.println("Tupla removido: " + tuplaProps.getDado1() + " | " + tuplaProps.getDado2());

        tupla.printTupla();
        tuplaProps = tupla.remover(20);
        if (tuplaProps != null)
            System.out.println("Tupla removido: " + tuplaProps.getDado1() + " | " + tuplaProps.getDado2());
        System.out.println("Eh vazia " + tupla.ehVazia());

        tupla.printTupla();
        tuplaProps = tupla.remover(50);
        if (tuplaProps != null)
            System.out.println("Tupla removido: " + tuplaProps.getDado1() + " | " + tuplaProps.getDado2());
        tupla.printTupla();
        System.out.println("Eh vazia " + tupla.ehVazia());

        tuplaProps = tupla.remover(30);
        if (tuplaProps != null)
            System.out.println("Tupla removido: " + tuplaProps.getDado1() + " | " + tuplaProps.getDado2());
        tupla.printTupla();
        System.out.println("Eh vazia " + tupla.ehVazia());

        tuplaProps = tupla.remover(0);
        if (tuplaProps != null)
            System.out.println("Tupla removido: " + tuplaProps.getDado1() + " | " + tuplaProps.getDado2());
        tupla.printTupla();
        System.out.println("Eh vazia " + tupla.ehVazia());


    }
}
