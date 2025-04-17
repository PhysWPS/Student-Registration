package controller;

import model.Aluno;
import model.Faculdade;
import view.FalculdadeView;

import java.util.List;

public class FaculdadeController {
    private Faculdade faculdade;
    private FalculdadeView view;

    public FaculdadeController(Faculdade faculdade, FalculdadeView view) {
        this.faculdade = faculdade;
        this.view = view;
    }


    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //Ligação entre view e faculdade


    public void cadastrarAluno(){
        Aluno novoEstudante = view.lerDadosAluno();
        faculdade.cadastrarAluno(novoEstudante);
        view.mensagem("Aluno cadastrado com sucesso! ");
    }

    public void excluirAluno(){
        String rga = view.lerRGA();
        boolean removido = faculdade.excluirAluno(rga);
        if (removido){
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado");
        }
    }


    public void listarAlunos(){
        List<Aluno> listaAlunos = faculdade.listarAlunos();
        view.mostrarAlunos(listaAlunos);
    }

    public void buscarAluno(){
        String rga = view.lerRGA();
        Aluno alunoBuscado = faculdade.buscarAluno(rga);
        view.mostrarAlunoBuscado(alunoBuscado);
    }


    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // OPCOES COMO INICIALIAR E PROCESSAR

    public void inicializar(){
        int opcao;

        do{
            view.mostrarMenu();
            opcao = view.lerOpcao();
            processarOpcao(opcao);
        } while(opcao != 5);
    }

    public void processarOpcao(int opcao){
        switch (opcao){
            case 1:
                cadastrarAluno();
                break;
            case 2:
                excluirAluno();
                break;
            case 3:
                listarAlunos();
                break;
            case 4:
                buscarAluno();
                break;
            case 5:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }




}
