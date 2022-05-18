package Projeto;
import java.util.Scanner;
import java.util.ArrayList;
public class Secretaria extends EntidadeEscolar implements ISecretaria {
    //Atributos-----------------------------------------------------------------------------
    ArrayList<Professor> professores;
    ArrayList<Disciplina> disciplinas;
    ArrayList<Aluno> Alunos;

    // Construtores ------------------------------------------------------------------------
    public Secretaria(String nome, String endereco, String telefone){
        super(nome, endereco, telefone);
        this.professores=new ArrayList<>();
        this.disciplinas=new ArrayList<>();
        this.Alunos=new ArrayList<>();
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
        System.out.println("Quantos alunos serão cadastrados?");
        int alunos = leitor.nextInt();
        for(int i = this.Alunos.size(); i<alunos; i++){
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
            String codigoA = leitor.nextLine();
            this.Alunos.add(new Aluno(codigoA, serieA, NomeA, enderecoA, telefoneA));
        }

    }

    @Override
    public void cadastrarProfessorTurma(Professor professor, Turma turma){
        System.out.println("Digite o codigo da turma que deseja cadastrar o Professor");
        leitor = new Scanner(System.in);
        String codigoTurma = leitor.nextLine();
        if (codigoTurma.equals(turma.getCodigoTurma())) {
            for(int i =0; i < 2; i++){
                professor.turmas[i]=turma;
            }
        }
    }



    @Override
    public void cadastrarAlunoTurma(Aluno aluno, Turma turma) {
        System.out.println("Digite o codigo da turma que deseja cadastrar o aluno");
        leitor = new Scanner(System.in);
        String codigoTurma = leitor.nextLine();
        if (codigoTurma.equals(turma.getCodigoTurma())){
            turma.ListaTurma.add(aluno);
            aluno.setTurma(turma);
        }
    }

    //Atributos de Secretaria
    public void cadastrarDisciplina(){ //criando objetos de disciplina
        Disciplina Matematica = new Disciplina("Matemática", "Mat1234", "Matemática e suas tecnologias");
        Disciplina Portugues = new Disciplina("Português", "Port1234", "Linguagens, Códigos e suas Tecnologias");
        Disciplina Historia = new Disciplina("História", "Hist1234", "Ciências Humanas");
        Disciplina Geografia = new Disciplina("Geografia", "Geo1234", "Ciências Humanas");
        Disciplina Ciencia = new Disciplina("Ciência", "Cien1234", "Ciências da Natureza");
        Disciplina Redacao = new Disciplina("Redação", "Red123", "Linguagens, Códigos e suas Tecnologias");

        this.disciplinas.add(Matematica); //adicionando no arraylist
        this.disciplinas.add(Portugues);
        this.disciplinas.add(Historia);
        this.disciplinas.add(Geografia);
        this.disciplinas.add(Ciencia);
        this.disciplinas.add(Redacao);

    }
    public void cadastrarProfessor(){//Criando objetos de professor
        Professor Pedro = new Professor("P1234", "Pedro", "Castelo Branco, Salvador, Bahia", "71 99912-3185", Matematica);
        Professor Leila = new Professor("L1234", "Leila", "Cajazeiras 5, Salvador, Bahia", "71 98752-9123", Matematica);
        Professor Jessica = new Professor("J1234", "Jessica", "Itapuã, Salvador, Bahia", "71 98825-6791", Portugues);
        Professor Carlos = new Professor("C1234", "Carlos", "Itaigara, Salvador, Bahia", "71 99214-3576", Portugues);
        Professor Otavio = new Professor("O1234", "Otavio", "Sussuarana, Salvador, Bahia", "71 99214-9851", Historia);
        Professor Bruna = new Professor("B1234", "Bruna", "São Marcos, Salvador, Bahia", "71 99214-2348", Historia);
        Professor Gisele = new Professor("G1234", "Gisele", "São Rafael, Salvador, Bahia", "71 99214-5028", Geografia);
        Professor Ruan = new Professor("R1234", "Ruan", "Paralela, Salvador, Bahia", "71 99214-3001", Geografia);
        Professor Duda = new Professor("D1234", "Duda", "Vale dos lagos, Salvador, Bahia", "71 99214-5578", Ciencia);
        Professor Aline = new Professor("A1234", "Aline", "Pituba, Salvador, Bahia", "71 99214-4171", Ciencia);
        Professor Ingride = new Professor("I1234", "Ingride", "Cajazeiras 11, Salvador, Bahia", "71 99214-7590", Redacao);
        Professor Manuel = new Professor("M1234", "Manuel", "Ribeira, Salvador, Bahia", "71 99214-8051", Redacao);

        this.professores.add(Pedro); //adicionando no arraylist
        this.professores.add(Leila);
        this.professores.add(Jessica);
        this.professores.add(Carlos);
        this.professores.add(Otavio);
        this.professores.add(Bruna);
        this.professores.add(Gisele);
        this.professores.add(Ruan);
        this.professores.add(Duda);
        this.professores.add(Aline);
        this.professores.add(Ingride);
        this.professores.add(Manuel);

    }
    public void cadastrarAlunos(){ //criando objetos de aluno
        Aluno Joao = new Aluno ("2548", "1º ano", "João", "São Marcos, Salvador, Bahia", "71 99999-8129");

        this.Alunos.add(Joao);//adicionando no arraylist
    }
    public void cadastrarTurma() {
        Turma A1 = new Turma("1A");
        Turma B1 = new Turma("1B");
        Turma A2 = new Turma("A1");
        Turma B2 = new Turma("B2");
        Turma A3 = new Turma("3A");
        Turma B3 = new Turma("3B");

    }
    public void Horariosturma(){
        A1.horariosTurma[0][0] = Geografia;
    }

    }