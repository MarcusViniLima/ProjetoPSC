package Projeto;

public abstract class EntidadeEscolar {
    // Atributos -------------------------------------------------------------------------
    protected String nome;
    protected String endereco;
    protected String telefone;

    // Construtores ----------------------------------------------------------------------
    //um construtor de uma classe abstrata serve para ser invocado pelas classes filhas
    public EntidadeEscolar(String nome, String endereco, String telefone){
        this.nome=nome;
        this.endereco=endereco;
        this.telefone=telefone;
    }

    //Getters & Setters ------------------------------------------------------------------
    public abstract String getEndereco();
    public abstract String getNome();
    public abstract String getTelefone();

    public abstract void setEndereco(String endereco);
    public abstract void setNome(String nome);
    public abstract void setTelefone(String telefone);
}
