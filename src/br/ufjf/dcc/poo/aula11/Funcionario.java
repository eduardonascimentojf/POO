package br.ufjf.dcc.poo.aula11;
import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private int matricula;
    private ArrayList<Atendimento> atendimentos;
    private Departamento departamento;

    public int getMatricula() {
        return matricula;
    }
    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}