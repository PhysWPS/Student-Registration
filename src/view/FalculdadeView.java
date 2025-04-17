package view;

import model.Aluno;

import java.util.List;
import java.util.Scanner;

public class FalculdadeView {
    private Scanner scanner;

    public FalculdadeView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        System.out.println("=============MENU===========");
        System.out.println("1. Adicionar aluno.");
        System.out.println("2. Remover aluno.");
        System.out.println("3. Listar alunos.");
        System.out.println("4. Procurar aluno por RGA");
        System.out.println("5. Sair");
    }

    public Aluno lerDadosAluno(){
        scanner.nextLine();
        System.out.println("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("RGA do aluno:");
        String rga = scanner.nextLine();
        System.out.println("Curso do aluno: ");
        String curso = scanner.nextLine();

        return new Aluno(nome, rga, curso);
    }

    public String lerRGA(){
        scanner.nextLine();
        System.out.println("Insira o RGA do estudante");
        return scanner.nextLine();
    }

    public int lerOpcao(){
        return scanner.nextInt();
    }

    public void mensagem(String mensagem){
        System.out.println(mensagem);
    }

    public void mostrarAlunos (List<Aluno> alunos){
        System.out.println("====Lista de Alunos====");
        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno matriculado.");
        } else {
            System.out.println("====Detalhes do Aluno====");
            System.out.println(alunos);
        }
    }

    public void mostrarAlunoBuscado(Aluno aluno){
        if(aluno == null) {
            System.out.println("Aluno não encontrado");
        } else {
            System.out.println("====Detalhes do Aluno====");
            System.out.println(aluno);
        }
    }
}
