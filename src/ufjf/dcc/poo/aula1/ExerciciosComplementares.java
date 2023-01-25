package ufjf.dcc.poo.aula1;

import java.util.Scanner;

/*
Exercicios Complementares
    1. Elaborar um programa para ler 5 valores inteiros. Em seguida, calcular e
    imprimir a soma desses valores.
    2. Elaborar um programa para ler 7 valores reais. Em seguida, calcular e
    imprimir a média desses valores.
    3. Elaborar um programa para calcular e apresentar o volume de uma lata de
    doce de leite. Utilize a fórmula do volume = 3.1415 ∗ raio ∗ raio ∗ altura.
    4. Elaborar um programa para calcular e apresentar o volume de uma caixa
    com forma retangular. Utilizar a fórmula do volume = comprimento ∗
    largura ∗ altura.
    5. Construa um algoritmo pedindo os lados de um triangulo. Após o prorama
    deve informar se o triângulo existe e exibir sua classificação (isósceles,
    escaleno, equilátero). Faça uma pesquisa para saber quando um triângulo
    existe.
 */
public class ExerciciosComplementares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Exercicio 1
        System.out.println("Exercicio 1: soma de numeros inteiros");
        int soma = 0, valorLido;
        for (int i = 0; i < 5; i++){
            System.out.println("Digite o valor"+ i);
            valorLido = scan.nextInt();
            soma += valorLido;
        }
        System.out.println("A soma dos valores é:" + soma);

        // Exercicio 2
        System.out.println("Exercicio 2: media de numeros reais");
        int numInteracao = 7 ;
        float media = 0, numLido;
        for (int i = 0; i < numInteracao; i++){
            System.out.println("Digite o valor"+ i);
            numLido = scan.nextFloat();
            media += numLido;
        }
        media = media/numInteracao;
        System.out.println("A soma dos valores é:" + media);

        // Exercicio 3
        System.out.println("Exercicio 3: volume de uma lata");
        float volumeLata, alturaLata,raioLata;
        System.out.println("Informe a altura da lata");
        alturaLata = scan.nextFloat();
        System.out.println("Informe o raio da lata");
        raioLata = scan.nextFloat();

        volumeLata = (float) 3.1415 * raioLata * raioLata * alturaLata;
        System.out.println("O volume da lata é de: "+ volumeLata);

        // Exercicio 4
        System.out.println("Exercicio 4: volume de uma caixa");
        float volumeCaixa,comprimentoCaixa, larguraCaixa, alturaCaixa;
        System.out.println("Informe o comprimento da caixa");
        comprimentoCaixa = scan.nextFloat();
        System.out.println("Informe a largura da caixa");
        larguraCaixa = scan.nextFloat();
        System.out.println("Informe a altura da caixa");
        alturaCaixa = scan.nextFloat();

        volumeCaixa = comprimentoCaixa * larguraCaixa * alturaCaixa;
        System.out.println("O volume da caixa é de: "+ volumeCaixa);

        /*
        Condição de existencia de um triangulo
            | b - c | < a < b + c
            | a - c | < b < a + c
            | a - b | < c < a + b
         */
        // Exercicio 5
        System.out.println("Exercicio 5: verifica se é um triângulo e seu tipo ");
        float ladoA,ladoB, ladoC;
        System.out.println("Informe o lado A do triângulo");
        ladoA = scan.nextFloat();
        System.out.println("Informe o lado B do triângulo");
        ladoB = scan.nextFloat();
        System.out.println("Informe o lado C do triângulo");
        ladoC = scan.nextFloat();

        if(ladoA > Math.abs(ladoB-ladoC) && ladoA < ladoB + ladoC &&
           ladoB > Math.abs(ladoA-ladoC) && ladoB < ladoA + ladoC &&
           ladoC > Math.abs(ladoA-ladoB) && ladoC < ladoA + ladoB
        ){
            if(ladoA == ladoB && ladoA == ladoC)
                System.out.println("Este triangulo é equilátero");
            else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
                System.out.println("Este triangulo é isósceles");
            else
                System.out.println("Este triangulo é escaleno");
        }else
            System.out.println("O lados informados não forma um triangulo");


    }
}
