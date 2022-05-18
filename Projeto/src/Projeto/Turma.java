package Projeto;

public class Turma {

    //Atributos da turma
    private String codigoTurma;
    private int quantAluno;
    private String alunosTurma;
    private String disciplinasTurma;
    private String horariosTurma;

//Construtor da Turma
    public Turma(String codigoTurma, int quantAluno,String alunosTurma,String disciplinasTurma,String horariosTurma) {

        this.codigoTurma = codigoTurma;
        this.quantAluno = quantAluno;
        this.alunosTurma = alunosTurma;
        this.disciplinasTurma=disciplinasTurma;
        this.horariosTurma=horariosTurma;

    }

// Getters e Setters dos Atributos Turma
    public String getCodigoTurma() {
        return this.codigoTurma;
    }
    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma=codigoTurma;
    }
    public int getquantAluno() {
        return this.quantAluno;
    }
    public void setquantAluno(int quantAluno) {
        this.quantAluno=quantAluno;
    }
    public String getalunosTurma() {
        return this.alunosTurma;
    }
    public void setalunosTurma(String alunosTurma) {
        this.alunosTurma=alunosTurma;
    }
    public String getdisciplinasTurma() {
        return this.disciplinasTurma;
    }
    public void setdisciplinasTurma(String disciplinasTurma) {
        this.disciplinasTurma=disciplinasTurma;
    }
    public String gethorariosTurma() {
        return this.horariosTurma;
    }
    public void sethorariosTurma(String horariosTurma) {
        this.horariosTurma=horariosTurma;
    }
}
