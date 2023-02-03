package br.ufjf.dcc.poo.exerciciosExtras.exercicio4.model;

import java.math.BigDecimal;
import java.util.Date;

public class Estadia {
    private Date dataHoraEntrada;
    private Date dataHoraSaida;
    private BigDecimal valor;
    private Veiculo veiculo;

    public Date getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(Date dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public Date getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Date dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
