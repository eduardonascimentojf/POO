package br.ufjf.dcc.poo.aula10.exercicio24;

public class Gerente extends  Funcionario {
    public void fecharCaixa() {
        System.out.println("pode Fechar o caixa");
    }
    public void printGerente(){
        System.out.println("Gerente");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Senha: "+ this.getSenha());
    }
}
