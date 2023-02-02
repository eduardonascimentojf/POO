package br.ufjf.dcc.poo.aula05;

public class Pessoa {
    private String nome;
    private  int idade;
    private  String sexo;

    Pessoa(String _nome, int _idade, String _sexo){
        this.nome = _nome;
        this.idade = _idade;
        this.sexo = _sexo;
    }
    Pessoa(){

    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void imprimirPessoa(){
        System.out.println("Nome :"+ this.nome);
        System.out.println("Idade :"+ this.idade);
        System.out.println("Sexo :"+ this.sexo);
    }

}
