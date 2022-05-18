package Projeto;
import java.util.Scanner;
import java.util.ArrayList;
public class Secretaria extends EntidadeEscolar implements ISecretaria {

    // Construtores ------------------------------------------------------------------------
    public Secretaria(String nome, String endereco, String telefone){
        super(nome, endereco, telefone);
    }

    //implementação obrigatória dos metódos abstratos da classe pai
    @Override
    public String getNome() {//implementação do método abstrato
        return nome+" -Secretária";
    }
    @Override
    public String getEndereco() {
    return endereco+" -Secretária";
    }
    @Override
    public String getTelefone() {
        return telefone+" -Secretária";
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
    Scanner leitor = new Scanner(System.in);
    @Override
    public void cadastrarAluno(){
        ArrayList<Aluno> listaAlunos;
        System.out.println("Quantos alunos serão cadastrados?");
        int alunos = leitor.nextInt();
        listaAlunos = new  ArrayList<>();
        for(int i = 0; i<alunos; i++){
            System.out.println("Digite o nome completo do aluno:");
            leitor = new Scanner(System.in);
            String NomeA = leitor.nextLine();
            System.out.println("Digite o telefone do aluno:");
            leitor = new Scanner(System.in);
            String telefoneA = leitor.nextLine();
            System.out.println("Digite o endereco do aluno:");
            leitor = new Scanner(System.in);
            String enderecoA = leitor.nextLine();
            System.out.println("Digite a serie do aluno:");
            leitor = new Scanner(System.in);
            String serieA = leitor.nextLine();
            System.out.println("Digite o codigo do aluno:");
            leitor = new Scanner(System.in);
            int codigoA = leitor.nextInt();
            listaAlunos.add(new Aluno(codigoA, serieA, NomeA, enderecoA, telefoneA));
        }

    }
    @Override
    public void cadastrarProfessor() {
        ArrayList<Professor> listaProfessores;
        System.out.println("Quantos alunos serão cadastrados?");
        int alunos = leitor.nextInt();
        listaProfessores = new ArrayList<>();
        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite o nome completo do aluno:");
            leitor = new Scanner(System.in);
            String NomeP = leitor.nextLine();
            System.out.println("Digite o telefone do aluno:");
            leitor = new Scanner(System.in);
            String telefoneP = leitor.nextLine();
            System.out.println("Digite o endereco do aluno:");
            leitor = new Scanner(System.in);
            String enderecoP = leitor.nextLine();
            System.out.println("Digite a disciplina do aluno:");
            leitor = new Scanner(System.in);
            int codigoP = leitor.nextInt();
            listaProfessores.add(new Professor(codigoP, NomeP, enderecoP, telefoneP));
        }
    }
    @Override
    public void cadastrarTurma(){

    }
    @Override
    public void cadastrarDisciplina(){

    }
    public boolean cadastrarProfessorDis(Disciplina disciplina){
        return Professor.setDisciplina(disciplina);
    }
}
