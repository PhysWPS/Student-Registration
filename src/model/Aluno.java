package model;

public class Aluno {
    private String nomeAluno;
    private String rgaAluno;
    private String cursoAluno;

    public Aluno(String nomeAluno, String rgaAluno, String cursoAluno) {
        this.nomeAluno = nomeAluno;
        this.rgaAluno = rgaAluno;
        this.cursoAluno = cursoAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getRgaAluno() {
        return rgaAluno;
    }

    public String getCursoAluno() {
        return cursoAluno;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "-Nome Aluno:" + nomeAluno  +
                "-RGA Aluno:'" + rgaAluno +
                "-Curso Aluno='" + cursoAluno + "\n";







    }
}
