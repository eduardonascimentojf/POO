package br.ufjf.dcc.poo.aula10.exercicio25;

public class Onibus extends Veiculo{
    private int lugar;

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }
    public void printOnibus(){
        System.out.println("Onibus");
        System.out.println("Placa: "+this.getPlaca());
        System.out.println("modelo: "+this.getModelo());
        System.out.println("Ultima Revisão: "+ this.getUltima_revisao());
        System.out.println("Proxima Revosão: "+ this.getProxima_revisao());
        System.out.println("Lugares: "+ this.getLugar());
    }

}