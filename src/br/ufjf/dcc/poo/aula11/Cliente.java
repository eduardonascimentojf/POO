package br.ufjf.dcc.poo.aula11;

public class Cliente extends Pessoa {
    private int codigo;
    private Atendimento atendimento;

    public int getCodigo() {
        return codigo;
    }
    public Atendimento getAtendimento() {
        return atendimento;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }
}