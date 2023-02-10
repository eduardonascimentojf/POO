package br.ufjf.dcc.poo.aula10.exercicioEnum;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (EnumPlanetas planeta: EnumPlanetas.values()){
            System.out.println(planeta);
        }

        System.out.println("Informe o Planeta e descubra uma caracteristica!");
        Planeta planeta = new Planeta(scan.next().toUpperCase());
        scan.close();
        planeta.viajarPlaneta();
    }
}
