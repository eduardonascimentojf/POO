package br.ufjf.dcc.poo.aula10.exercicioRecord.exercicioInterfaces;

public record ProdutoRecord(String Nome, Integer valor) {
    public ProdutoRecord(String nome){
        this(nome, 300);
    }
    public ProdutoRecord(Integer valor){
        this("Nome default com valor", valor);
    }
    public ProdutoRecord(){
        this("Nome default sem valor", 350);
    }
    public void fazAlgo(){
        System.out.println("Processando informações usando record");
    }

}

