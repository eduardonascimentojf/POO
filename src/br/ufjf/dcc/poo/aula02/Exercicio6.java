package br.ufjf.dcc.poo.aula02;

import javax.swing.*;

/*
Exercicio 6
    Os motoristas se preocupam com o consumo de combustível dos seus automóveis. Um motorista monitorou vários
    tanques cheios de gasolina registrando a quilometragem dirigida e a quantidade de combustível em litros utilizado
    para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros
    de asolina do tanque cheio (ambos como inteiros). O programa deve calcular e exibir o consumo em quilômetros/litro.
    Utilize caixas de diálogo de entrada para obter os dados do usuário.
 */
public class Exercicio6 {
    public static void main(String[] args) {
        int Km = Integer.parseInt(JOptionPane.showInputDialog(null, "Km percorrido"));
        int Litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Litros consumido"));

        float consumo = (float) Km/Litros;
        System.out.println("O consumo eh de quilometro "+ consumo+"Km por litro");
    }
}
