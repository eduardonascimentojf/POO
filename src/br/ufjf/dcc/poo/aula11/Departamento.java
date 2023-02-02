package br.ufjf.dcc.poo.aula11;

import java.util.ArrayList;

public class Departamento {
    private int codigo;
    private ArrayList<Funcionario> funcionarios;

    public int getCodigo() {
        return codigo;
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
