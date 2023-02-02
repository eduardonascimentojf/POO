package br.ufjf.dcc.poo.aula06;

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
public class Exercicio22 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setNome("Fulano");
        conta1.setNumero(9999);
        conta1.setAgencia("9999");
        conta1.setSaldo(195.85);
        conta1.setCriadoEm(new Date());

        conta1.printConta();
        System.out.println("Valor sacado "+ conta1.sacar(50.00)+ "\n\n");
        conta1.printConta();
        conta1.depositar(270.00);
        System.out.println("\n");
        conta1.printConta();
        System.out.println("Valor com rendimento "+ conta1.calculaRendimento());



    }
}
