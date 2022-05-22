package Projeto;
import java.util.Scanner;
import java.util.ArrayList;
public class Secretaria extends EntidadeEscolar implements ISecretaria {
    //Atributos-----------------------------------------------------------------------------
    ArrayList<Professor> professores;
    ArrayList<Disciplina> disciplinas;
    ArrayList<Aluno> Alunos;
    ArrayList<Turma> Turmas;

    // Construtores ------------------------------------------------------------------------
    public Secretaria(String nome, String endereco, String telefone){
        super(nome, endereco, telefone);
        this.professores=new ArrayList<Professor>();
        this.disciplinas=new ArrayList<Disciplina>();
        this.Alunos=new ArrayList<Aluno>();
        this.Turmas = new ArrayList<Turma>();
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
        for(int i = 0; i < alunos; i++){
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
    public void cadastrarProfessor(){
        System.out.println("Quantos professsores serão cadastrados?");
        leitor = new Scanner(System.in);
        int professores = leitor.nextInt();
        for(int i = 0; i < professores; i++){
            System.out.println("Digite o código do professor");
            leitor = new Scanner(System.in);
            String codigo = leitor.nextLine();
            System.out.println("Digite o nome do professor");
            leitor = new Scanner(System.in);
            String nome = leitor.nextLine();
            System.out.println("Digite o endereco do professor");
            leitor = new Scanner(System.in);
            String endereco = leitor.nextLine();
            System.out.println("Digite o telefone do professor");
            leitor = new Scanner(System.in);
            String telefone = leitor.nextLine();
            this.professores.add(new Professor(codigo, nome, endereco, telefone));
        }
    }
    @Override
    public void cadastrarDisciplina(){
        System.out.println("Quantos disciplinas serão cadastrados?");
        leitor = new Scanner(System.in);
        int disciplinas = leitor.nextInt();
        for(int i = 0; i < disciplinas; i++){
            System.out.println("Digite o código da disciplina");
            leitor = new Scanner(System.in);
            String codigo = leitor.nextLine();
            System.out.println("Digite o nome da disciplina");
            leitor = new Scanner(System.in);
            String nome = leitor.nextLine();
            System.out.println("Digite o tipo da disciplina");
            leitor = new Scanner(System.in);
            String tipo = leitor.nextLine();
            this.disciplinas.add(new Disciplina(nome, codigo,tipo));
        }
    }
    @Override
    public void cadastrarTurma(){
        System.out.println("Quantas turmas serão cadastradas?");
        leitor = new Scanner(System.in);
        int turmas = leitor.nextInt();
        for(int i = 0; i < turmas; i++){
            System.out.println("Digite o código da disciplina");
            leitor = new Scanner(System.in);
            String codigo = leitor.nextLine();
            this.Turmas.add(new Turma(codigo));
        }
    }
    @Override
    public void cadastrarProfessorDisciplina(){
        System.out.println("Digite o código do professor:");
        leitor = new Scanner(System.in);
        String codigoProfessor = leitor.nextLine();
        for(int i = 0; i < professores.size(); i++) {
            if (this.professores.get(i).getCodigoProfessor().equals(codigoProfessor)){
                System.out.println("Digite o código da disciplina:");
                leitor = new Scanner(System.in);
                String codigoDisciplina = leitor.nextLine();
                for(int j = 0; j < disciplinas.size(); j++) {
                    if (this.disciplinas.get(j).getCodigoDisciplina().equals(codigoDisciplina)) {
                        this.professores.get(i).setDisciplina(disciplinas.get(j));
                        System.out.println("Disciplina cadastrada com sucesso");
                    } else {
                        System.out.println("Codigo da disciplina incorreto");
                    }
                }
            }else{
                System.out.println("Código do professor errado");
            }
        }
    }
    @Override
    public void cadastrarProfessorTurma(){ //***************precisa melhorar
        System.out.println("Digite o código do professor:");
        leitor = new Scanner(System.in);
        String codigoProfessor = leitor.nextLine();
        for(int i = 0; i < professores.size(); i++) {
            if(this.professores.get(i).getCodigoProfessor().equals(codigoProfessor)){
                System.out.println("Digite o código da turma:");
                leitor = new Scanner(System.in);
                String codigoTurma = leitor.nextLine();
                for(int j = 0; j < this.Turmas.size(); j++) {
                    if (this.Turmas.get(j).getCodigoTurma().equals(codigoTurma)) {
                        this.professores.get(i).setTurmas(Turmas.get(j));
                        System.out.println("Professor cadastrado na turma com sucesso!");
                    } else {
                        System.out.println("Código da turma incorreto!");
                    }
                }
            }else{
                System.out.println("Código do Professor inválido");
            }
        }

    }
    @Override
    public void cadastrarAlunoTurma() { //***********precisa concertar
        System.out.println("Digite o codigo do Aluno");
        leitor = new Scanner(System.in);
        String codigoAluno = leitor.nextLine();
        for(int i = 0; i < Alunos.size(); i++){
            if(this.Alunos.get(i).getCodigoAluno().equals(codigoAluno)){
                System.out.println("Digite o codigo da turma");
                leitor = new Scanner(System.in);
                String codigoTurma = leitor.nextLine();
                for(int j = 0; j < this.Alunos.size(); j++) {
                    if (this.Turmas.get(j).getCodigoTurma().equals(codigoTurma)) {
                        this.Alunos.get(i).setTurma(this.Turmas.get(j));
                        this.Turmas.get(j).quantAluno();
                        this.Turmas.get(j).setListaTurma(this.Alunos.get(i));
                    } else {
                        System.out.println("Código da turma inválido");
                    }
                }
            }else{
                System.out.println("Código do aluno inválido");
        }
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
        Professor Pedro = new Professor("P1234", "Pedro", "Castelo Branco, Salvador, Bahia", "71 99912-3185");
        Professor Leila = new Professor("L1234", "Leila", "Cajazeiras 5, Salvador, Bahia", "71 98752-9123");
        Professor Jessica = new Professor("J1234", "Jessica", "Itapuã, Salvador, Bahia", "71 98825-6791");
        Professor Carlos = new Professor("C1234", "Carlos", "Itaigara, Salvador, Bahia", "71 99214-3576");
        Professor Otavio = new Professor("O1234", "Otavio", "Sussuarana, Salvador, Bahia", "71 99214-9851");
        Professor Bruna = new Professor("B1234", "Bruna", "São Marcos, Salvador, Bahia", "71 99214-2348");
        Professor Gisele = new Professor("G1234", "Gisele", "São Rafael, Salvador, Bahia", "71 99214-5028");
        Professor Ruan = new Professor("R1234", "Ruan", "Paralela, Salvador, Bahia", "71 99214-3001");
        Professor Duda = new Professor("D1234", "Duda", "Vale dos lagos, Salvador, Bahia", "71 99214-5578");
        Professor Aline = new Professor("A1234", "Aline", "Pituba, Salvador, Bahia", "71 99214-4171");
        Professor Ingride = new Professor("I1234", "Ingride", "Cajazeiras 11, Salvador, Bahia", "71 99214-7590");
        Professor Manuel = new Professor("M1234", "Manuel", "Ribeira, Salvador, Bahia", "71 99214-8051");

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
        Turma A1 = new Turma("1A");
        Turma B1 = new Turma("1B");
        Turma A2 = new Turma("2A");
        Turma B2 = new Turma("2B");
        Turma A3 = new Turma("3A");
        Turma B3 = new Turma("3B");

        Turmas.add(A1);
        Turmas.add(B1);
        Turmas.add(A2);
        Turmas.add(B2);
        Turmas.add(A3);
        Turmas.add(B3);



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

        Aluno Joao = new Aluno ("2548", "1º ano", "João", "São Marcos, Salvador, Bahia", "71 99999-8129");

        this.Alunos.add(Joao);//adicionando no arraylist

    }

    public void cadastrarAlunos(Aluno aluno){ //criando objetos de aluno
        this.Alunos.add(aluno);
    }
    public void cadastrarProfessor(Professor professor){
        this.professores.add(professor);
    }
    public void cadastrarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void cadastrarTurma(Turma turma){
        Turmas.add(turma);
    }
    public boolean buscarProfessor( String codigoProfessor){
        for (int i = 0; i < professores.size(); i ++) {
            if(this.professores.get(i).getCodigoProfessor().equals(codigoProfessor)) {
                System.out.println(this.professores.get(i).toString());
            }else{
                System.out.println("Código referente ao professor está incorreto!");
                return false;
            }
        }
        return true;
    }
    public boolean buscarAluno( String codigoAluno) { //criando objetos de turma
        for (int i = 0; i < Alunos.size(); i ++) {
            if(this.Alunos.get(i).getCodigoAluno().equals(codigoAluno)) {
                System.out.println(this.Alunos.get(i).toString());
            }else{
                System.out.println("Código referente ao aluno incorreto!");
                return false;
            }
        }
        return true;
    }
    public boolean buscarDisciplina(String codigoDiciplina){
        for (int i = 0; i < disciplinas.size(); i ++) {
            if(this.disciplinas.get(i).getCodigoDisciplina().equals(codigoDiciplina)) {
                System.out.println(this.disciplinas.get(i).toString());
            }else{
                System.out.println("Código referente a disciplina incorreto!");
                return false;
            }
        }
        return true;
    }
    public boolean buscarTruma(String CodigoTurma){
        for (int i = 0; i < Turmas.size(); i ++) {
            if(this.Turmas.get(i).getCodigoTurma().equals(CodigoTurma)) {
                System.out.println(this.Turmas.get(i).toString());
            }else{
                System.out.println("Código referente a turma incorreto!");
                return false;
            }
        }
        return true;
    }
    public void ListaDeAlunos() {
            for (int i = 0; i < Alunos.size(); i++) {
                System.out.println("Aluno: " + Alunos.get(i).getNome()+" | Código: "+Alunos.get(i).getCodigoAluno()+" | Série: "+Alunos.get(i).getSerie());
            }
    }
    public void ListaDeProfessores(){
        for(int i = 0; i < professores.size(); i++){
            System.out.println("Professor: " + professores.get(i).getNome()+" | Código: "+professores.get(i).getCodigoProfessor()+" | Disciplina: "+professores.get(i).getDisciplina().getNome());
        }
    }
    public void ListaDeDisciplinas(){
        for(int i = 0; i < disciplinas.size(); i++){
            System.out.println(disciplinas.get(i).toString());
        }
    }
    public void ListaDeTurma(){
        for(int i = 0 ; i <Turmas.size(); i++){
            System.out.println(Turmas.get(i).toString());
        }
    }

    }