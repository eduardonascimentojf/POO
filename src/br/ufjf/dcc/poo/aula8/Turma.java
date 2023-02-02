package br.ufjf.dcc.poo.aula8;

import java.util.*;

public class Turma {
    private final Map<String, Aluno> turma = new HashMap<>();

    public void cadastrarAluno(Aluno aluno) {

        if (!turma.containsKey(aluno.getMatricula())) {
            turma.put(aluno.getMatricula(), aluno);
        }
    }


//   public ArrayList<Aluno> listarTodosAlunos() {
//        ArrayList<Aluno> alunos = new ArrayList<>();
//        for (String keyAluno : turma.keySet()) {
//            alunos.add(turma.get(keyAluno));
//        }
//        return alunos;
//    }


    public void listarTodosAlunos() {
        System.out.println("Listando todos os Aluno ");
        for (String keyAluno : turma.keySet()) {
            System.out.println("Aluno "+ turma.get((keyAluno)).getNome());
        }

    }
//    public ArrayList<Aluno> listarAlunosPorSobrenome(String nome) {
//        ArrayList<Aluno> alunos = new ArrayList<>();
//        for (String keyAluno : turma.keySet()) {
//            if (Objects.equals(turma.get(keyAluno).getNome(), nome))
//                alunos.add(turma.get(keyAluno));
//        }
//        return alunos;
//    }

    public void listarAlunosPorSobrenome(String nome) {
        System.out.println("Listando todos os Alunos com sobrenome " + nome);
        for (String keyAluno : turma.keySet()) {
            if (Objects.equals(turma.get(keyAluno).getNome(), nome))
                System.out.println("Aluno "+ turma.get((keyAluno)).getNome());
        }

    }

        public void listarAlunosMaisVelho() {
        int idade = 0;
        String keyAlunoMaisVelho = "";
        for (String keyAluno : turma.keySet()) {
            if(turma.get(keyAluno).idade() >= idade){
                idade = turma.get(keyAluno).idade();
                keyAlunoMaisVelho = keyAluno;
            }
        }
        System.out.println("O aluno mais velho é: "+ turma.get(keyAlunoMaisVelho).getNome());
    }

    public void idadeMedia() {
        double mediaIdade = 0;
        for (String aluno : turma.keySet()) {
            mediaIdade += turma.get(aluno).idade();
        }
        mediaIdade /= turma.size() - 1;
        System.out.println("A media da turma é de: " + mediaIdade);
    }
    public void atualizaAluno(Aluno alunoAtualizado) {
        for (String keyAluno : turma.keySet()) {
            if (Objects.equals(turma.get(keyAluno).getMatricula(), alunoAtualizado.getMatricula()))
                turma.replace(keyAluno, alunoAtualizado);
        }
    }
    public void removeAluno(String matricula) {
        for (String keyAluno : turma.keySet()) {
            if (Objects.equals(turma.get(keyAluno).getMatricula(), matricula)) {
              turma.remove(keyAluno);
              return;
            }
        }
    }
}
