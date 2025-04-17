package model;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nomeFaculdade;
    private List<Aluno> alunosFaculdade;

    public Faculdade(String nomeFaculdade) {
        this.nomeFaculdade = nomeFaculdade;
        this.alunosFaculdade = new ArrayList<>();
    }

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public void cadastrarAluno(Aluno aluno){
        alunosFaculdade.add(aluno);
    }

    public boolean excluirAluno(String rga){
        for (Aluno a: alunosFaculdade){
            if (a.getRgaAluno().equalsIgnoreCase(rga)){
                return alunosFaculdade.remove(a);
            }
        }
        return false;
        //return alunosFaculdade.removeIf(c -> c.getRgaAluno().equalsIgnoreCase(rga));
    }

    public List<Aluno> listarAlunos(){
        /*
        retorna uma cópia da lista original sem alterar a lista original.
         */
        return new ArrayList<>(alunosFaculdade); // cria uma lista com base na original
    }

    public Aluno buscarAluno(String rga){
        for (Aluno a: alunosFaculdade){
            if (a.getRgaAluno().equalsIgnoreCase(rga)){
                return a;
            }
        }
    return null;
    }

    public String getNomeFaculdade() {
        return nomeFaculdade;
    }
}
