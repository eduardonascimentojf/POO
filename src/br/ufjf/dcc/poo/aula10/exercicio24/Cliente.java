package br.ufjf.dcc.poo.aula10.exercicio24;

public class Cliente extends Usuario {

    public void comprar(){
        System.out.println("O cliente pode comprar!");
    }
    public void printCliente(){
        System.out.println("Cliente");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Senha: "+ this.getSenha());
    }
}
