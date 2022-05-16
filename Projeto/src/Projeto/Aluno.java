package Projeto;

public class Aluno extends EntidadeEscolar {
    // Atributos ---------------------------------------------------------------------------
    private int codigoAluno;
    private String serie;
    private double frequencia;

    // Construtores ------------------------------------------------------------------------
    public Aluno(int codigoAluno, String serie, String nome, String endereco, String telefone ){
        super(nome, endereco, telefone); // invocação do construtor da classe pai
        this.codigoAluno=codigoAluno;
        this.frequencia=0;
        this.serie=serie;
    }

    //implementação obrigatória dos metódos abstratos da classe pai
    @Override
    public String getNome() {//implementação do método abstrato
        return nome+" -Aluno";
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
    public int getCodigoAluno() {
        return codigoAluno;
    }
    public double getFrequencia() {
        return frequencia;
    }
    public String getSerie() {
        return serie;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
}
