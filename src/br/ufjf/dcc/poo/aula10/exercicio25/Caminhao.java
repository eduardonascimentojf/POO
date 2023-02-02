package br.ufjf.dcc.poo.aula10.exercicio25;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {
    private int licenca;
    private BigDecimal valor_estimado;

    public int getLicenca() {
        return licenca;
    }
    public BigDecimal getValor_estimado() {
        return valor_estimado;
    }
    public void setLicenca(int licenca) {
        this.licenca = licenca;
    }
    public void setValor_estimado(BigDecimal valor_estimado) {
        this.valor_estimado = valor_estimado;
    }

    public void printCaminhao(){
        System.out.println("Caminhão");
        System.out.println("Placa: "+this.getPlaca());
        System.out.println("modelo: "+this.getModelo());
        System.out.println("Ultima Revisão: "+ this.getUltima_revisao());
        System.out.println("Proxima Revosão: "+ this.getProxima_revisao());
        System.out.println("Licença: "+ this.getLicenca());
        System.out.println("Valor estimado: "+ this.getValor_estimado());


    }
}
