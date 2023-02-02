package br.ufjf.dcc.poo.aula11.model;

public class Atendimento {
    private int codigoAtendimento;
    private Cliente cliente;
    private Funcionario funcionario;

    public int getCodigoAtendimento() {
        return codigoAtendimento;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setCodigoAtendimento(int codigoAtendimento) {
        this.codigoAtendimento = codigoAtendimento;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}