package br.ufjf.dcc.poo.aula7;

import java.util.Date;

/*
 Exercício 22
    Construa um novo projeto no Eclipse e dê o nome para ele de Exercicio21.
    • Em seguida modele uma conta. Ela deve ter o nome do jtular (String), o número (int), a agência (String), o
    saldo (double) e uma data de abertura (String). Além disso, ela deve fazer as seguintes ações: saca, para
    rejrar um valor do saldo; deposita, para adicionar um valor ao saldo; calculaRendimento para devolver o
    rendimento mensal dessa conta, que é de 10% sobre o saldo. Use o conceito de encapsulamento.
    • Teste a classe usando uma outra classe que tenha o main. Você deve criar a classe da conta com o
    nome Conta, mas pode nomear como quiser a classe de testes. Por exemplo, pode chamá-la TestaConta.
    Contudo, ela deve necessariamente ter o método main.
  */
public class ExercicioComStatic {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setNome("Fulano");
        conta1.setNumero(9999);
        conta1.setAgencia("9999");
        conta1.setSaldo(195.85);
        conta1.setCriadoEm(new Date());
        conta1.printConta();
        // Get e Set de um atributo da classe e não do objeto
        Conta.setNumeroContas();
        System.out.println("Numeros de contas "+ Conta.getNumeroContas());

        Conta conta2 = new Conta();
        conta2.setNome("Ciclano ");
        conta2.setNumero(8888);
        conta2.setAgencia("8888");
        conta2.setSaldo(800);
        conta2.setCriadoEm(new Date());
        conta2.printConta();
        Conta.setNumeroContas();
        System.out.println("Numeros de contas "+ Conta.getNumeroContas());

        Conta conta3 = new Conta();
        conta3.setNome("Fulana");
        conta3.setNumero(7777);
        conta3.setAgencia("7777");
        conta3.setSaldo(700);
        conta3.setCriadoEm(new Date());
        conta3.printConta();
        Conta.setNumeroContas();
        System.out.println("Numeros de contas "+ Conta.getNumeroContas());

    }
}
