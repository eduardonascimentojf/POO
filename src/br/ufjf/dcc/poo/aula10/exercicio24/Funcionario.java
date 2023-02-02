package br.ufjf.dcc.poo.aula10.exercicio24;


public class Funcionario  extends Usuario {

    public void venderProduto() {
        System.out.println("Venda de produto");
    }

    public void printFuncionario(){
        System.out.println("Funcionario");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Senha: "+ this.getSenha());
    }
}