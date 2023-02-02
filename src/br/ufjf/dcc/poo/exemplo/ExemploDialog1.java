package br.ufjf.dcc.poo.exemplo;

import javax.swing.*;
/*
Exemplo 1 -> Aula 2
    Fazer um programa que receba o nome de um usuário e imprima uma
    mensagem da seguinte forma:
    Olá, NOME_USUARIO!
 */
public class ExemploDialog1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite um nome");
        System.out.println("Ola,"+ nome);

    }
}
