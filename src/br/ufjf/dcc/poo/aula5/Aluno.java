package br.ufjf.dcc.poo.aula5;

public class Aluno {
    private  String matricula;
    private  String nome;
    private  float prova1;
    private  float prova2;
    private  float trabalho;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    public void setTrabalho(float trabalho) {
        this.trabalho = trabalho;
    }

    public double calculaMedia(){
      return (this.prova1*2.5 + this.prova2*2.5 + this.trabalho*2)/7;
  }
    public double notaParaProvaFinal(){
        double media = this.calculaMedia();
        if(media>=60)
            return 0;
        if(this.prova1 <= this.prova2)
            return (60*7 - this.prova2*2.5 - this.trabalho*2)/2.5;
        return (60*7 - this.prova1*2.5- this.trabalho*2)/2.5;

    }

    public void printAluno(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Prova 1: "+ this.prova1);
        System.out.println("Prova 2: "+ this.prova2);
        System.out.println("Trabalho: "+ this.trabalho);
        System.out.println("Media: "+ this.calculaMedia());
    }
}
