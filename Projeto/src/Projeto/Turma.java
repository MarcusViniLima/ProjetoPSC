package Projeto;

import java.util.ArrayList;
import java.util.Collections;

public class Turma {
    //Atributos da turma
    ArrayList<String> ListaTurma;
    private final String codigoTurma;
    private int quantAluno;


//Construtor da Turma
    public Turma(String codigoTurma) {
        this.ListaTurma = new ArrayList<>();
        this.codigoTurma = codigoTurma;
        this.quantAluno = 0;
    }

// Getters e Setters dos Atributos Turma
    public String getCodigoTurma() {
        return this.codigoTurma;
    }
    public int getquantAluno() {
        return this.quantAluno;
    }



    //Metodos de turma----------------------------------------------------------------------------------------------------
    public int quantAluno(){
        return quantAluno++;
    }
    public int quantAlunoRemovido(){
        return quantAluno--;
    }
    public void alunosDaTurma(){
        Collections.sort(ListaTurma);
        for(int i = 0; i < ListaTurma.size(); i++){
            System.out.println("Aluno: "+this.ListaTurma.get(i)+" | ");
        }
    }

    public void setListaTurma(String aluno){
        this.ListaTurma.add(aluno);
    }

    @Override
    public String toString() {
        return "Turma= "+getCodigoTurma()+"| Alunos= " + quantAluno +"|";
    }
}
