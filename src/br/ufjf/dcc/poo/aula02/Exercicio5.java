package br.ufjf.dcc.poo.aula02;

import javax.swing.*;

/*
Exercicio 5
    Construa uma aplicação que calcule a distância entre dois pontos em um
    plano. Solicite via caixas de diálogo os valores x e y de cada ponto (A e B) e
    utilize a equação abaixo para dar os resultados
 */
public class Exercicio5 {
    public static void main(String[] args) {
        double valorX0 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de X0"));
        double valorY0 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de Y0"));
        double valorX1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de X1"));
        double valorY1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de Y1"));
        float dist = (float) Math.sqrt(Math.pow((valorX0 + valorY0),2)+Math.pow((valorX1+ valorY1),2));
        System.out.println("Distancia: "+ dist);
    }
}
