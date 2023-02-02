package br.ufjf.dcc.poo.aula02;

import javax.swing.*;
/*
Exercício Desafio
    Implemente uma calculadora que realize as operações de soma, subtração,
    divisão e multiplicação sobre os números reais. A cada operação deve ser
    atualizado o valor em memória, iniciado com zero, e ser dada a opção se o
    usuário deseja finalizar o programa.
 */
public class ExercicioDesafio {
    public static void main(String[] args) {

        float valor1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o numero 1"));
        String opercao = JOptionPane.showInputDialog(null, "Digite a operação: +, -, *, /");
        float valor2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o numero 2"));
        float resultado;

        switch (opercao) {
            case "+" ->
                resultado = valor1 + valor2;

            case "-" ->
                resultado = valor1 - valor2;

            case "*" ->
                resultado = valor1 * valor2;

            case "/" -> {
                if (valor2 == 0)
                    throw new IllegalArgumentException("Nao eh possivel divisao por zero (0)");

                resultado = valor1 / valor2;
            }
            default -> throw new IllegalArgumentException("Operação invalida: " + opercao);
        }
        JOptionPane.showInternalMessageDialog(null, "O resultado de "+ valor1 +" "+ opercao + " "+ valor2 +" = " + resultado);

    }
}
