package Projeto;

public class Secretaria extends EntidadeEscolar implements ISecretaria {

    // Construtores ------------------------------------------------------------------------
    public Secretaria(String nome, String endereco, String telefone){
        super(nome, endereco, telefone);
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

    // implementando metodos da interface
    @Override
    public void cadastrarAluno(){

    }

}
