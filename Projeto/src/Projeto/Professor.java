package Projeto;

public class Professor extends EntidadeEscolar {
    // Atributos ---------------------------------------------------------------------------
    private String codigoProfessor;
    Turma[] turmas;
    private Disciplina disciplinas;

    // Construtores ------------------------------------------------------------------------
    public Professor(String codigoProfessor, String nome, String endereco, String telefone, Disciplina disciplinas) {
        super(nome, endereco, telefone);
        this.codigoProfessor = codigoProfessor;
        this.disciplinas = disciplinas;
        this.turmas = new Turma[2];
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


    public void setCodigoProfessor(String codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplinas = disciplina;
    }

    // mostar os atributos de professor -------------------------------------------------------------------


    @Override
    public String toString() {
        return "Professor: "+getNome()+" com seguintes dados: "+getEndereco()+", "+getTelefone()+
                ", Ministra a "+ getDisciplina()+", nas turmas: "+turmas;
    }
}
