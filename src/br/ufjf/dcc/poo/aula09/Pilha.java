package br.ufjf.dcc.poo.aula09;

import java.util.ArrayList;

public class Pilha<T> {

    private final ArrayList<T>  pilha;

    Pilha(){
        this.pilha = new ArrayList<>();
    }
    public void empilhar(T element){
        this.pilha.add(element);
    }
    public T desempilhar(){
        if(this.pilha.size() > 0)
            return this.pilha.remove(this.pilha.size()-1);
        return null;
    }
    public boolean ehVazia(){
        return this.pilha.isEmpty();
    }

    public void printPilha(){
        int tamanho = this.pilha.size()-1;
        while (tamanho >= 0){
            System.out.println(this.pilha.get(tamanho));
            tamanho--;
        }
    }
}
