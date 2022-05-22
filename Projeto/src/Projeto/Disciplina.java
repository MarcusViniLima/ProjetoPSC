package Projeto;

public class Disciplina {
    //Atributos-----------------------------------------------------
    private String codigoDisciplina;
    private String tipo;
    private String nome;

    //Construtor--------------------------------------------------
    public Disciplina(String nome, String codigoDisciplina, String tipo){
        this.codigoDisciplina = codigoDisciplina;
        this.tipo = tipo;
        this.nome=nome;
    }

    //Getters e Setters------------------------------------------
    public String getCodigoDisciplina(){
        return codigoDisciplina;
    }
    public String getTipo(){
        return tipo;
    }
    public String getNome() {
        return nome;
    }

    //mostrar os atributos da disciplina ---------------------------------------------
    @Override
    public String toString() {
        return "Disciplina: "+getNome()+" | Código: "+getCodigoDisciplina()+" | Tipo: "+getTipo();
    }
}
