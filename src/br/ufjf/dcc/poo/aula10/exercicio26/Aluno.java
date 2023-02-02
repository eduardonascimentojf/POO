package br.ufjf.dcc.poo.aula10.exercicio26;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aluno extends Pessoa{
    public String ra;
    public Calendar anoIngresso;

    public void print(){
        Date date = this.dataNascimento.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        String date1 = format1.format(date);

        System.out.println("UUID: "+ this.idPessoa);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Data Nascimento: "+ date1);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("RG: "+ this.rg);
        System.out.println("RA: "+ this.ra);
        date = this.anoIngresso.getTime();
        date1 = format1.format(date);
        System.out.println("Ano Ingresso: "+ date1);
    }
}
