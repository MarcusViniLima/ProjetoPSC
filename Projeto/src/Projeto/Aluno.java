package Projeto;

public class Aluno extends EntidadeEscolar {
    // Atributos ---------------------------------------------------------------------------
    private String codigoAluno;
    private String serie;
    Turma turma;

    // Construtores ------------------------------------------------------------------------
    public Aluno(String codigoAluno, String serie, String nome, String endereco, String telefone ){
        super(nome, endereco, telefone); // invocação do construtor da classe pai
        this.codigoAluno=codigoAluno;
        this.serie=serie;
        this.turma=turma;
    }

    //implementação obrigatória dos metódos abstratos da classe pai
    @Override
    public String getNome() {//implementação do método abstrato
        return nome+" -Aluno";
    }
    @Override
    public String getEndereco() {
        return endereco+" -Aluno";
    }
    @Override
    public String getTelefone() {
        return telefone+" -Aluno";
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
    public String getCodigoAluno() {
        return codigoAluno;
    }
    public String getSerie() {
        return serie;
    }
    public Turma getTurma() {
        return turma;
    }

    public void setCodigoAluno(String codigoAluno) {
        this.codigoAluno = codigoAluno;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
