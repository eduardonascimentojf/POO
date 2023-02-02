package br.ufjf.dcc.poo.aula10.exercicio26;

import java.text.ParseException;
import java.util.Calendar;
import java.util.UUID;

public class Exercicio26 {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.set(2002, Calendar.DECEMBER, 12);
        Aluno aluno = new Aluno();
        aluno.idPessoa = UUID.randomUUID();
        aluno.nome = "Fulano";
        aluno.dataNascimento = c;
        aluno.cpf = "111.111.11-11";
        aluno.rg = "XX-11.111.111";
        aluno.ra = "11111";
        c.set(2013, Calendar.FEBRUARY, 28);
        aluno.anoIngresso = c;
        aluno.print();


        c.set(1991, Calendar.NOVEMBER, 11);
        Professor professor = new Professor();
        professor.idPessoa = UUID.randomUUID();
        professor.nome = "Sicrano";
        professor.dataNascimento = c;
        professor.cpf = "444.444.444-44";
        professor.rg = "XX-44.444.444";
        professor.matricula = "4444444444";
        professor.codigoDepartamento = "YYY444";
        professor.print();


        c.set(1985, Calendar.JANUARY, 9);
        Funcionario funcionario = new Funcionario();
        funcionario.idPessoa = UUID.randomUUID();
        funcionario.nome = "Beltrano";
        funcionario.dataNascimento = c;
        funcionario.cpf = "999.999.999-99";
        funcionario.rg = "XX-99.999.999";
        funcionario.numeroCadastro = "99999999";
        funcionario.codigoSetor = "SSS999";
        funcionario.print();


    }
}
