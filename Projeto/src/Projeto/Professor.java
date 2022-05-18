package Projeto;

public class Professor extends EntidadeEscolar {
    // Atributos ---------------------------------------------------------------------------
    private int codigoProfessor;
    private Turma turmas;
    private Disciplina disciplina;

    // Construtores ------------------------------------------------------------------------
    public Professor(int codigoProfessor, String nome, String endereco, String telefone){
        super(nome, endereco, telefone);
        this.codigoProfessor = codigoProfessor;
        this.disciplina = disciplina;
        this.turmas = null;
    }

    //implementação obrigatória dos metódos abstratos da classe pai
    @Override
    public String getNome() {//implementação do método abstrato
        return nome+" -Professor";
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
        return disciplina;
    }
    public int getCodigoProfessor() {
        return codigoProfessor;
    }
    public Turma getTurmas() {
        return turmas;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public void setTurmas(Turma turmas) {
        this.turmas = turmas;
    }
}
