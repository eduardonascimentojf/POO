package br.ufjf.dcc.poo.exerciciosExtras.exercicio2.controller;

import br.ufjf.dcc.poo.exerciciosExtras.exercicio2.model.Aluno;
import br.ufjf.dcc.poo.exerciciosExtras.exercicio2.model.Disciplina;
import br.ufjf.dcc.poo.exerciciosExtras.exercicio2.model.Professor;

import java.util.ArrayList;

public class ExercicioExtra2 {
    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("POO");
        disciplina1.setCargaHoraria(60);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Modelagem");
        disciplina2.setCargaHoraria(60);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setNome("BD");
        disciplina3.setCargaHoraria(60);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setNome("Redes");
        disciplina4.setCargaHoraria(60);

        ArrayList<Disciplina> disciplinasAluno = new ArrayList<>();
        disciplinasAluno.add(disciplina1);
        disciplinasAluno.add(disciplina2);
        disciplinasAluno.add(disciplina3);

        ArrayList<Disciplina> disciplinasProfessor = new ArrayList<>();
        disciplinasProfessor.add(disciplina3);
        disciplinasProfessor.add(disciplina4);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro");
        aluno1.setIdade(23);
        aluno1.setSexo("M");
        aluno1.setMatricula("1234567");
        aluno1.setMensalidade(950.00f);
        aluno1.setBolsa(120.00f);
        aluno1.setDisciplinas(disciplinasAluno);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Ana");
        aluno2.setIdade(27);
        aluno2.setSexo("F");
        aluno2.setMatricula("1237657");
        aluno2.setMensalidade(950.00f);
        aluno2.setBolsa(180.00f);
        aluno2.setDisciplinas(disciplinasAluno);

        Professor professor = new Professor();
        professor.setNome("Gleiph");
        professor.setIdade(36);
        professor.setSexo("M");
        professor.setFormacao("Doutorado");
        professor.setHoraAula(43.00f);
        professor.setQuantidadeAulas(15);
        professor.setDisciplinas(disciplinasProfessor);

        ArrayList<Aluno> alunosDisciplina = new ArrayList<>();
        alunosDisciplina.add(aluno1);
        alunosDisciplina.add(aluno2);

        Disciplina disciplina5 = new Disciplina();
        disciplina5.setNome("Prog Web");
        disciplina5.setCargaHoraria(60);
        disciplina5.setProfessor(professor);
        disciplina5.setAlunos(alunosDisciplina);

        for (Aluno a : disciplina5.getAlunos()) {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Sexo: " + a.getSexo());
        }

    }
}
