package Projeto;

import java.util.ArrayList;

public class Professor extends EntidadeEscolar {
    // Atributos ---------------------------------------------------------------------------
    private final String codigoProfessor;
    ArrayList<Turma> turmas;
    private final Disciplina disciplinas;

    // Construtores ------------------------------------------------------------------------
    public Professor(String codigoProfessor, String nome, String endereco, String telefone, Disciplina disciplina) {
        super(nome, endereco, telefone);
        this.codigoProfessor = codigoProfessor;
        this.disciplinas = disciplina;
        this.turmas = new ArrayList<>();
    }

    //implementação obrigatória dos metódos abstratos da classe pai
    @Override
    public String getNome() {//implementação do método abstrato
        return nome;
    }
    @Override
    public String getEndereco() {
        return endereco;
    }
    @Override
    public String getTelefone() {
        return telefone;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Getters & Setters ------------------------------------------------------------------
    public Disciplina getDisciplina() {
        return disciplinas;
    }
    public String getCodigoProfessor() {
        return codigoProfessor;
    }

    // mostar os atributos de professor -------------------------------------------------------------------


    @Override
    public String toString() {
        return "Professor: "+getNome()+ "| Código: "+getCodigoProfessor()+" | Endereço: "+getEndereco()+" | Telefone: "+getTelefone()+
                "| Ministra "+disciplinas.getNome()+" | Turmas: "+turmas.toString()+"|";
    }
}
