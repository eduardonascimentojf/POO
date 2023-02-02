package br.ufjf.dcc.poo.aula11.model;

public abstract class Pessoa {

    private String nome;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;

    public String getNome() {
        return nome;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public int getNumero() {
        return numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


}