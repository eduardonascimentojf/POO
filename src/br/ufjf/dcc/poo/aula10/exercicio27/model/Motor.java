package br.ufjf.dcc.poo.aula10.exercicio27.model;

public class Motor extends Parte {
    private float potencia;
    private float corrente;
    private int rpm;

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getCorrente() {
        return corrente;
    }

    public void setCorrente(float corrente) {
        this.corrente = corrente;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public void print(){
        System.out.println("Motor");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Codigo: "+ this.getCodigo());
        System.out.println("Valor: "+ this.getValor());
        System.out.println("Potencia: "+ this.getPotencia());
        System.out.println("Corrente: "+ this.getCorrente());
        System.out.println("RPM: "+ this.getRpm());

    }
}
