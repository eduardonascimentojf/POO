package br.ufjf.dcc.poo.exerciciosExtras.exercicio3.model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private Date dataPedido;
    private String vendedor;
    private String status;
    private String observacoes;
    private Cliente cliente;

    private List<ItenPedido> itensPedidos;

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItenPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItenPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    public void encerrarPedido(){
        System.out.println("Encerrar Pedido");
    }
    public void cancelarPedido(){
        System.out.println("Cancelar Pedido");
    }


}
