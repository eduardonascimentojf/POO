package br.ufjf.dcc.poo.aula10.exercicio24;



/*
Exercicio 24
    Em um sistema de loja, há 3 tipos de usuário: gerente, funcionário e cliente. Todo usuário tem nome e senha.
    O cliente possui, além do nome e senha, outros dados cadastrais. O funcionário possui métodos relacionados
    a venda de produtos. O gerente pode fazer tudo que o funcionário pode e também fechamento do caixa.
    Como é a hierarquia de herança desse sistema no que se refere a controle de usuários? Implemente em JAVA
  */
public class Exercicio24 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Cliente cliente = new Cliente();

        funcionario.venderProduto();
        funcionario.setNome("Vendedor");
        funcionario.setSenha("123");
        funcionario.printFuncionario();

        gerente.fecharCaixa();
        gerente.venderProduto();
        gerente.setNome("Gerente");
        gerente.setSenha("123");
        gerente.printGerente();

        cliente.comprar();
        cliente.setNome("Cliente");
        cliente.setSenha("123");
        cliente.printCliente();
    }


}
