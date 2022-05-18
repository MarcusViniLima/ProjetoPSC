package Projeto;

import java.util.ArrayList;

public class Turma {


    //Atributos da turma
    ArrayList<Aluno> ListaTurma;
    private String codigoTurma;
    private int quantAluno;
     Disciplina[][] horariosTurma;

//Construtor da Turma
    public Turma(String codigoTurma) {
        this.ListaTurma=new ArrayList<>();
        this.codigoTurma = codigoTurma;
        this.quantAluno = quantAluno();
        this.horariosTurma= new Disciplina[3][5];

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


    //Metodos de turma----------------------------------------------------------------------------------------------------
    public int quantAluno(){
        return quantAluno++;
    }



}
