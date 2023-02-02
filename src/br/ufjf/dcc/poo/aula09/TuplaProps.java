package br.ufjf.dcc.poo.aula09;

public class TuplaProps <T,V>{
    private T dado1;
    private V dado2;

    public TuplaProps(T dado1, V dado2) {
        this.dado1 = dado1;
        this.dado2 = dado2;
    }

    public T getDado1() {
        return dado1;
    }

    public void setDado1(T dado1) {
        this.dado1 = dado1;
    }

    public V getDado2() {
        return dado2;
    }

    public void setDado2(V dado2) {
        this.dado2 = dado2;
    }
}
