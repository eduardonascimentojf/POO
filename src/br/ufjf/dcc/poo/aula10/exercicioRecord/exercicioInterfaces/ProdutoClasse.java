package br.ufjf.dcc.poo.aula10.exercicioRecord.exercicioInterfaces;

import java.util.Objects;

public class ProdutoClasse {
    private String nome;
    private Integer valor;

    public ProdutoClasse(String nome, Integer valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoClasse produtoClasse = (ProdutoClasse) o;
        return nome.equals(produtoClasse.nome) &&   valor.equals(produtoClasse.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valor);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + nome + '\'' +
                ", password='" + valor + '\'' +
                '}';
    }
    public void fazAlgo(){
        System.out.println("Processando informações usando class");
    }
}
