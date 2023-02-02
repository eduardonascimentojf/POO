package br.ufjf.dcc.poo.aula10.exercicio24;

public abstract class Usuario {
    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
