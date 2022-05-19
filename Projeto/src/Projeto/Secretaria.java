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
    public void cadastrarProfessorTurma(Professor professor, Turma turma){ //***************precisa melhorar
        System.out.println("Digite o codigo da turma que deseja cadastrar o Professor");
        leitor = new Scanner(System.in);
        String codigoTurma = leitor.nextLine();
        if (codigoTurma.equals(turma.getCodigoTurma())) {
            for(int i =0; i < 2; i++){
                professor.turmas[i]=turma;
            }
        }else{
            System.out.println("Código inválido");
        }
    }

    @Override
    public void cadastrarAlunoTurma(Aluno aluno, Turma turma) { //***********precisa concertar
        System.out.println("Digite o codigo da turma que deseja cadastrar o aluno");
        leitor = new Scanner(System.in);
        String codigoTurma = leitor.nextLine();
        if (codigoTurma.equals(turma.getCodigoTurma())){
            for(int i =0; i < 25; i++){
                turma.ListaTurma[i] = aluno;//*********concertar
                aluno.setTurma(turma);
                turma.quantAluno();
            }
        } else{
            System.out.println("Código inválido");
        }
    }

    //Atributos de Secretaria
    private void cadastros(){ //criando objetos de disciplina, professor e turma
        //criando objeto de disciplina
        Disciplina Matematica = new Disciplina("Matemática", "Mat1234", "Matemática e suas tecnologias");
        Disciplina Portugues = new Disciplina("Português", "Port1234", "Linguagens, Códigos e suas Tecnologias");
        Disciplina Historia = new Disciplina("História", "Hist1234", "Ciências Humanas");
        Disciplina Geografia = new Disciplina("Geografia", "Geo1234", "Ciências Humanas");
        Disciplina Ciencia = new Disciplina("Ciência", "Cien1234", "Ciências da Natureza");
        Disciplina Redacao = new Disciplina("Redação", "Red123", "Linguagens, Códigos e suas Tecnologias");

        this.disciplinas.add(Matematica); //adicionando no arraylist de disciplina
        this.disciplinas.add(Portugues);
        this.disciplinas.add(Historia);
        this.disciplinas.add(Geografia);
        this.disciplinas.add(Ciencia);
        this.disciplinas.add(Redacao);

        //criando objeto de professor
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

        this.professores.add(Pedro); //adicionando no arraylist de professor
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

        //criando objeto de professor;
        Turma A1 = new Turma("1A", 25);
        Turma B1 = new Turma("1B", 25);
        Turma A2 = new Turma("2A", 25);
        Turma B2 = new Turma("2B", 25);
        Turma A3 = new Turma("3A", 25);
        Turma B3 = new Turma("3B", 25);

        //preenchendo o array de horarios de cada turma
        A1.horariosTurma[0][0] = Matematica;
        A1.horariosTurma[1][0] = Matematica;
        A1.horariosTurma[2][0] = Ciencia;
        A1.horariosTurma[3][0] = Ciencia;

        A1.horariosTurma[0][1] = Geografia;
        A1.horariosTurma[1][1] = Geografia;
        A1.horariosTurma[2][1] = Portugues;
        A1.horariosTurma[3][1] = Portugues;

        A1.horariosTurma[0][2] = Historia;
        A1.horariosTurma[1][2] = Historia;
        A1.horariosTurma[2][2] = Redacao;
        A1.horariosTurma[3][2] = Redacao;

        A1.horariosTurma[0][3] = Portugues;
        A1.horariosTurma[1][3] = Portugues;
        A1.horariosTurma[2][3] = Matematica;
        A1.horariosTurma[3][3] = Matematica;

        A1.horariosTurma[0][4] = Ciencia;
        A1.horariosTurma[1][4] = Ciencia;
        A1.horariosTurma[2][4] = Geografia;
        A1.horariosTurma[3][4] = Geografia;

        //Horario turma B do Primeiro Ano

        B1.horariosTurma[0][0] = Ciencia;
        B1.horariosTurma[1][0] = Ciencia;
        B1.horariosTurma[2][0] = Matematica;
        B1.horariosTurma[3][0] = Matematica;

        B1.horariosTurma[0][1] = Portugues;
        B1.horariosTurma[1][1] = Portugues;
        B1.horariosTurma[2][1] = Geografia;
        B1.horariosTurma[3][1] = Geografia;

        B1.horariosTurma[0][2] = Redacao;
        B1.horariosTurma[1][2] = Redacao;
        B1.horariosTurma[2][2] = Historia;
        B1.horariosTurma[3][2] = Historia;

        B1.horariosTurma[0][3] = Matematica;
        B1.horariosTurma[1][3] = Matematica;
        B1.horariosTurma[2][3] = Portugues;
        B1.horariosTurma[3][3] = Portugues;

        B1.horariosTurma[0][4] = Geografia;
        B1.horariosTurma[1][4] = Geografia;
        B1.horariosTurma[2][4] = Ciencia;
        B1.horariosTurma[3][4] = Ciencia;

        //Horario turma A do 2 Ano

        A2.horariosTurma[0][0] = Portugues;
        A2.horariosTurma[1][0] = Portugues;
        A2.horariosTurma[2][0] = Historia;
        A2.horariosTurma[3][0] = Historia;

        A2.horariosTurma[0][1] = Matematica;
        A2.horariosTurma[1][1] = Matematica;
        A2.horariosTurma[2][1] = Ciencia;
        A2.horariosTurma[3][1] = Ciencia;

        A2.horariosTurma[0][2] = Ciencia;
        A2.horariosTurma[1][2] = Ciencia;
        A2.horariosTurma[2][2] = Portugues;
        A2.horariosTurma[3][2] = Portugues;

        A2.horariosTurma[0][3] = Redacao;
        A2.horariosTurma[1][3] = Redacao;
        A2.horariosTurma[2][3] = Geografia;
        A2.horariosTurma[3][3] = Geografia;

        A2.horariosTurma[0][4] = Matematica;
        A2.horariosTurma[1][4] = Matematica;
        A2.horariosTurma[2][4] = Historia;
        A2.horariosTurma[3][4] = Historia;

        //Horario turma B do 2 Ano

        B2.horariosTurma[0][0] = Historia;
        B2.horariosTurma[1][0] = Historia;
        B2.horariosTurma[2][0] = Portugues;
        B2.horariosTurma[3][0] = Portugues;

        B2.horariosTurma[0][1] = Redacao;
        B2.horariosTurma[1][1] = Redacao;
        B2.horariosTurma[2][1] = Matematica;
        B2.horariosTurma[3][1] = Matematica;

        B2.horariosTurma[0][2] = Portugues;
        B2.horariosTurma[1][2] = Portugues;
        B2.horariosTurma[2][2] = Ciencia;
        B2.horariosTurma[3][2] = Ciencia;

        B2.horariosTurma[0][3] = Geografia;
        B2.horariosTurma[1][3] = Geografia;
        B2.horariosTurma[2][3] = Redacao;
        B2.horariosTurma[3][3] = Redacao;

        B2.horariosTurma[0][4] = Historia;
        B2.horariosTurma[1][4] = Historia;
        B2.horariosTurma[2][4] = Matematica;
        B2.horariosTurma[3][4] = Matematica;

        //Horario Turma A do Terceiro Ano

        A3.horariosTurma[0][0] = Geografia;
        A3.horariosTurma[1][0] = Geografia;
        A3.horariosTurma[2][0] = Redacao;
        A3.horariosTurma[3][0] = Redacao;

        A3.horariosTurma[0][1] = Historia;
        A3.horariosTurma[1][1] = Historia;
        A3.horariosTurma[2][1] = Geografia;
        A3.horariosTurma[3][1] = Geografia;

        A3.horariosTurma[0][2] = Matematica;
        A3.horariosTurma[1][2] = Matematica;
        A3.horariosTurma[2][2] = Geografia;
        A3.horariosTurma[3][2] = Geografia;

        A3.horariosTurma[0][3] = Historia;
        A3.horariosTurma[1][3] = Historia;
        A3.horariosTurma[2][3] = Ciencia;
        A3.horariosTurma[3][3] = Ciencia;

        A3.horariosTurma[0][4] = Redacao;
        A3.horariosTurma[1][4] = Redacao;
        A3.horariosTurma[2][4] = Portugues;
        A3.horariosTurma[3][4] = Portugues;

        //Horario Turma B do Terceiro Ano

        B3.horariosTurma[0][0] = Redacao;
        B3.horariosTurma[1][0] = Redacao;
        B3.horariosTurma[2][0] = Geografia;
        B3.horariosTurma[3][0] = Geografia;

        B3.horariosTurma[0][1] = Geografia;
        B3.horariosTurma[1][1] = Geografia;
        B3.horariosTurma[2][1] = Historia;
        B3.horariosTurma[3][1] = Historia;

        B3.horariosTurma[0][2] = Geografia;
        B3.horariosTurma[1][2] = Geografia;
        B3.horariosTurma[2][2] = Matematica;
        B3.horariosTurma[3][2] = Matematica;

        B3.horariosTurma[0][3] = Ciencia;
        B3.horariosTurma[1][3] = Ciencia;
        B3.horariosTurma[2][3] = Historia;
        B3.horariosTurma[3][3] = Historia;

        B3.horariosTurma[0][4] = Portugues;
        B3.horariosTurma[1][4] = Portugues;
        B3.horariosTurma[2][4] = Redacao;
        B3.horariosTurma[3][4] = Redacao;

    }

    public void cadastrarAlunos(){ //criando objetos de aluno
        Aluno Joao = new Aluno ("2548", "1º ano", "João", "São Marcos, Salvador, Bahia", "71 99999-8129");

        this.Alunos.add(Joao);//adicionando no arraylist
    }
    public void cadastrarTurma() { //criando objetos de turma

    }
    public void Horariosturma(){ //preenchendo array de cada turma

    }

    public void cadastrarProfessor(){//Criando objetos de professor

    }

    }