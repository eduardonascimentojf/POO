package br.ufjf.dcc.poo.aula10.exercicio25;

import java.math.BigDecimal;
import java.util.Date;

public class Exercicio25 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Date date = new Date();

        Onibus onibus = new Onibus();
        onibus.setPlaca("XXXX-999");
        onibus.setModelo("mercedes-benz");
        onibus.setUltima_revisao(date);
        onibus.setProxima_revisao(new Date(date.getYear()+1, date.getMonth(), date.getDate()));
        onibus.setLugar(76);
        onibus.printOnibus();



        Caminhao caminhao = new Caminhao();
        caminhao.setPlaca("XXXX-000");
        caminhao.setModelo("mercedes-benz");
        caminhao.setUltima_revisao(date);
        caminhao.setProxima_revisao(new Date(date.getYear()+1, date.getMonth(), date.getDate()));
        caminhao.setLicenca(99988800);
        caminhao.setValor_estimado(new BigDecimal("650000.00"));
        caminhao.printCaminhao();
    }
}
