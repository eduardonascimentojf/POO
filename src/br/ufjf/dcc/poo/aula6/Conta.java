
package br.ufjf.dcc.poo.aula6;

import java.util.Date;

public class Conta {
    private String nome;
    private int numero;
    private String agencia;
    private double saldo;
    private Date criadoEm;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    public void printConta() {
        System.out.println("Informações da conta para testes");
        System.out.println("Nome " + this.getNome());
        System.out.println("Numero " + this.getNumero());
        System.out.println("Agencia " + this.getAgencia());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("criado em " + this.getCriadoEm() + " \n");
    }

    public double sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            return valor;
        }
        System.out.println("O valor informado é maior que saldo");
        double saldo = this.saldo;
        this.saldo = 0;
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado + " + valor + " com sucesso ");
    }

    public double calculaRendimento() {
        return this.saldo + this.saldo * 0.10;
    }
}

