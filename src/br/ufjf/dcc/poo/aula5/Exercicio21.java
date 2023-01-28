package br.ufjf.dcc.poo.aula5;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        Aluno [] alunos = new Aluno[] {aluno1, aluno2, aluno3};

        for (int i = 0; i<3; i++){

            System.out.println("Preenchemento do Aluno "+ (i+1));
            System.out.println("Informe a matricula");
            alunos[i].setMatricula(scan.next());
            System.out.println("Informe o nome");
            alunos[i].setNome(scan.next());
            System.out.println("Informe a nota da Prova 1");
            alunos[i].setProva1(scan.nextInt());
            System.out.println("Informe a nota da Prova 2");
            alunos[i].setProva2(scan.nextInt());
            System.out.println("Informe a nota do trabalho");
            alunos[i].setTrabalho(scan.nextInt());

        }
        System.out.println("Lista de Alunos");
        for (int i = 0; i<3; i++){

            System.out.println("Aluno "+ (i+1));
            alunos[i].printAluno();
            double notaParaSerAprovado =   alunos[i].notaParaProvaFinal();
            if(notaParaSerAprovado == 0)
                System.out.println("Parabens você foi aprovado");
            else if(notaParaSerAprovado <= 100)
                System.out.println("Você precisa tirar uma nota maior ou igual a " + notaParaSerAprovado);
            else
                System.out.println("Você precisa tirar uma nota superior do 100 :(");
        }
    }
}
