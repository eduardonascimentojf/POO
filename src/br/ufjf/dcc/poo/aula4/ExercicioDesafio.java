package br.ufjf.dcc.poo.aula4;

import javax.swing.*;

public class ExercicioDesafio {
    public static void main(String[] args) {

        int linha = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas"));
        int coluna = Integer.parseInt(JOptionPane.showInputDialog("Quantas colunas"));
        int[][] notas = new int[linha][coluna];

        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++) {
                int randomNum =(int)(Math.random()*100);
                notas[i][j] = randomNum;
                System.out.print(notas[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
