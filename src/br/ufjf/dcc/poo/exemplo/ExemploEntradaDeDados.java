package br.ufjf.dcc.poo.exemplo;

import javax.swing.*;
import java.util.Scanner;

public class ExemploEntradaDeDados {
    public static void main(String[] args) {

        String nomeDialog = JOptionPane.showInputDialog("Seu nome");
        int idadeDialog = Integer.parseInt(JOptionPane.showInputDialog("Sua idade"));
        float alturaDialog = Float.parseFloat(JOptionPane.showInputDialog("Sua altura"));

        System.out.printf("Dados do Dialog: Nome %s, idade %d e altura, %f\n", nomeDialog, idadeDialog, alturaDialog);


        Scanner teclado = new Scanner(System.in);

        System.out.println("Seu nome");
        String nomeTeclado = teclado.next();
        System.out.println("Sua idade");
        int idadeTeclado = teclado.nextInt();
        System.out.println("Sua altura");
        float alturaTeclado = teclado.nextFloat();

        System.out.printf("Dados do Teclado: Nome %s, idade %d e altura, %f\n",nomeTeclado, idadeTeclado, alturaTeclado);







    }
}
