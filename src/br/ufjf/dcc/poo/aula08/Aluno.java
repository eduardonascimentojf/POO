package br.ufjf.dcc.poo.aula08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private String nome;
    private String matricula;
    private String dataNascimento;
    private String sexo;

    public Aluno(String nome, String matricula, String dataNascimento, String sexo) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int idade() {
        String anoNasc, anoAtual;
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
        String dataAtual = formatador.format(data);

        anoNasc = this.dataNascimento.split("/")[2];

        anoAtual = dataAtual.split("-")[2];


        return  Integer.parseInt(anoAtual) -  Integer.parseInt(anoNasc);
    }
}