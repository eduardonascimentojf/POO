package br.ufjf.dcc.poo.aula8;

import java.util.ArrayList;

/*
Exercicio 23
    Considere um aluno como um conjunto de atributos, entre eles, matrícula,
    nome, data de nascimento e sexo. Crie a classe Aluno com os atributos mencionados, os métodos get e set.
    Crie a classe Turma que permita:
    • Cadastrar alunos sem matrícula repeYda;
    • Listar todos os alunos;
    • Listar os alunos com o sobrenome informado;
    • Listar o nome do aluno mais idoso;
    • Listar a média de idade os alunos;
    • Atualizar os dados de um aluno, pesquisando por matrícula;
    • Remover os dados de um aluno, pesquisando por matrícula;
 */
public class Exercicio23 {
    public static void main(String[] args) {
        String nome, matricula, dataNascimento, sexo;
        Turma turma = new Turma();
        ArrayList<Aluno> alunos = new ArrayList<>();
        for (int i =0; i < 5; i++){
            nome = "nome"+i;
            matricula = "xxxxx"+i;
            dataNascimento = "15/08/201"+i;
            sexo = "M";
            alunos.add(new Aluno(nome, matricula, dataNascimento, sexo));
            turma.cadastrarAluno(alunos.get(i));
        }
        System.out.println("\nTeste para criar e metodos primarios\n");
        turma.listarTodosAlunos();
        turma.listarAlunosPorSobrenome("nome1");
        turma.idadeMedia();
        turma.listarAlunosMaisVelho();

        System.out.println("\nTeste para atualizar 1\n");
        turma.atualizaAluno(new Aluno("TesteAtt", "xxxxx3", "15/08/2000", "M"));
        turma.listarAlunosMaisVelho();
        turma.listarTodosAlunos();

        System.out.println("\nTeste para atualizar 2\n");
        turma.atualizaAluno(new Aluno("nome1", "xxxxx4", "15/08/2022", "M"));
        turma.listarAlunosPorSobrenome("nome1");
        turma.listarTodosAlunos();

        System.out.println("\nTeste para cadastrar matricula repetida 2\n");
        turma.cadastrarAluno(new Aluno("nome1", "xxxxx4", "15/08/2022", "M"));
        turma.listarTodosAlunos();

        System.out.println("\nTeste para remover 2\n");
        turma.removeAluno("xxxxx3");
        turma.listarTodosAlunos();


        System.out.println("\nTeste para cadastrar matricula apagada\n");
        turma.cadastrarAluno(new Aluno("nome1", "xxxxx3", "15/08/2022", "M"));
        turma.listarTodosAlunos();

    }
}
