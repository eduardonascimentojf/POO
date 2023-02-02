package br.ufjf.dcc.poo.aula03;

import java.util.Scanner;

/*
Exercicio 11
    O dono de um supermercado quer modificar o cálculo do preço final das mercadorias usando como base
    o seu valor de custo:
    • Até R$2,00 inclusive, o acréscimo deve ser um valor fixo de R$0,15;
    • Entre R$2,00 e R$5,00 inclusive, o acréscimo deve ser proporcional, de 2%;
    • Entre R$5,00 e R$20,00 inclusive, deve ser proporcional, de 10%;
    • Acima de R$20,00, o acréscimo deve ser proporcional, de 8%.
    • Exemplo. Um produto que custe R$ 28,00, terá acréscimo de R$ 2,35:
    • R$ 0,15 => referente aos primeiros R$ 2,00;
    • + R$ 0,06 => referente aos 2% sobre a faixa R$ 2,00 a R$ 5,00 (R$ 3);
    • + R$ 1,50 => referente aos 10% sobre a faixa R$ 5,00 a R$ 20,00 (R$ 15);
    • + R$ 0,64 => referente aos 8% acima de R$ 20,00.
    • Elabore um programa que leia o valor de custo do produto e imprima o seu preço final.
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto que quer alterar!");
        float preco = scan.nextFloat();
        float precoAtualizado = preco;

        if(preco > 2.00)
            precoAtualizado += 0.15;
        if((preco-2) > 5.00)
            precoAtualizado += 3 * 0.02;
        if ((preco -5)> 20.00)
            precoAtualizado += 15 * 0.10;
        if ((preco - 20) > 0 )
            precoAtualizado += (preco - 20) * 0.08;

        System.out.println("O preco novo antigo era R$"+ preco + " e agora é R$" + precoAtualizado);
    }
}
