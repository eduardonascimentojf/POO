package br.ufjf.dcc.poo.exemplo;

import javax.swing.*;
/*
Exemplo 1
    Fazer um programa que receba o nome de um usuário e imprima uma
    mensagem da seguinte forma:
    Olá, NOME_USUARIO!
 */
public class Exemplo1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite um nome");
        System.out.println("Ola,"+ nome);
    }
}
