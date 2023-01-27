package br.ufjf.dcc.poo.exemplo;

import javax.swing.*;

/*
Exemplo 2 -> Aula 2
    Faça um programa que receba dois números inteiros e retorne a soma deles.
 */
public class ExemploDialog2 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de X0"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de Y0"));
        int soma = numero1 + numero2;

        System.out.println("Soma dos valores é: "+ soma);
        //JOptionPane.showMessageDialog(parentComponent, mensssage, title, messageType, icon)
        JOptionPane.showMessageDialog(null, "Soma dos valores é: "+ soma);

        //JOptionPane.showConfirmDialog(null, "Soma dos Valores: " + soma, "Soma")
        //JOptionPane.showInternalConfirmDialog(null, "Soma: " +soma, "Soma");



    }
}
