package br.ufjf.dcc.poo.aula09;

import java.util.ArrayList;


public class Tupla<T, V> {

    private final ArrayList<TuplaProps<T, V>> tupla;

    Tupla() {
        this.tupla = new ArrayList<>();
    }

    public void adicionar(T element1, V element2) {
        TuplaProps<T, V> tuplaProps = new TuplaProps<>(element1, element2);
        this.tupla.add(tuplaProps);
    }

    public TuplaProps<T, V> remover(T index) {
        int tamanho = this.tupla.size() - 1;
        while (tamanho >= 0) {
            if (this.tupla.get(tamanho).getDado1() == index)
                return this.tupla.remove(tamanho);
            tamanho--;
        }
        return null;

    }

    public boolean ehVazia() {

        return this.tupla.isEmpty();
    }

    public void printTupla() {
        int tamanho = this.tupla.size() - 1;
        TuplaProps<T, V>  tuplaProps;
        while (tamanho >= 0) {
            tuplaProps = this.tupla.get(tamanho);
            System.out.println(tuplaProps.getDado1() + " | " + tuplaProps.getDado2());
            tamanho--;
        }
    }
}
