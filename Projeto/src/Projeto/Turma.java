package Projeto;

import java.util.ArrayList;
import java.util.Arrays;

public class Turma {
    //Atributos da turma
    ArrayList<Aluno> ListaTurma;
    private String codigoTurma;
    private int quantAluno;
     Disciplina[][] horariosTurma;

//Construtor da Turma
    public Turma(String codigoTurma) {
        this.ListaTurma = new ArrayList<Aluno>();
        this.codigoTurma = codigoTurma;
        this.quantAluno = 0;
        this.horariosTurma= new Disciplina[4][5];


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

    public void setListaTurma(Aluno aluno) {
        this.ListaTurma.add(aluno);
    }

    //Metodos de turma----------------------------------------------------------------------------------------------------
    public int quantAluno(){
        return quantAluno++;
    }

    @Override
    public String toString() {
        return "Turma codigoTurma= "+getCodigoTurma()+"| Alunos= " + quantAluno +"| Horarios da Turma= "+horariosTurma.toString()+"|";
    }
}
