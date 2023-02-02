package br.ufjf.dcc.poo.aula10.exercicio25;

import java.util.Date;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private Date ultima_revisao;
    private Date proxima_revisao;

    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public Date getUltima_revisao() {
        return ultima_revisao;
    }
    public Date getProxima_revisao() {
        return proxima_revisao;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setUltima_revisao(Date ultima_revisao) {
        this.ultima_revisao = ultima_revisao;
    }
    public void setProxima_revisao(Date proxima_revisao) {
        this.proxima_revisao = proxima_revisao;
    }
}
