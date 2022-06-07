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
        cadastros();
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
        System.out.println("--------------CADASTRO DE ALUNOS--------------------");
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
            cadastrarAlunoTurma();
        }

    }
    @Override
    public void cadastrarAlunoTurma() { //***********precisa concertar
        System.out.println("-----------------------CADASTRAR O ALUNO NA TURMA------------------------");
        System.out.println("Digite o codigo do Aluno");
        leitor = new Scanner(System.in);
        String codigoAluno = leitor.nextLine();
        for(int i = 0; i < Alunos.size(); i++){
            if(this.Alunos.get(i).getCodigoAluno().equals(codigoAluno)){
                System.out.println("Digite o codigo da turma");
                leitor = new Scanner(System.in);
                String codigoTurma = leitor.nextLine();
                for(int j = 0; j < this.Turmas.size(); j++) {
                    if (this.Turmas.get(j).getCodigoTurma().equals(codigoTurma)) {
                        this.Alunos.get(i).setTurma(this.Turmas.get(j));
                        this.Turmas.get(j).quantAluno();
                        this.Turmas.get(j).setListaTurma(this.Alunos.get(i).getNome());
                        System.out.println("Aluno cadastrado na turma com sucesso");
                    }
                }
            }else{
                System.out.println("Código do aluno ou turma inválido");
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

        //preenchendo arraylist de professor.turmas
        Pedro.turmas.add(A1); Pedro.turmas.add(A2); Pedro.turmas.add(A3);
        Leila.turmas.add(B1); Leila.turmas.add(B2); Leila.turmas.add(B3);
        Jessica.turmas.add(A1); Jessica.turmas.add(A2); Jessica.turmas.add(A3);
        Carlos.turmas.add(B1); Carlos.turmas.add(B2); Carlos.turmas.add(B3);
        Otavio.turmas.add(A1); Otavio.turmas.add(A2); Otavio.turmas.add(A3);
        Bruna.turmas.add(B1); Bruna.turmas.add(B2); Bruna.turmas.add(B3);
        Gisele.turmas.add(A1); Gisele.turmas.add(A2); Gisele.turmas.add(A3);
        Ruan.turmas.add(B1); Ruan.turmas.add(B2); Ruan.turmas.add(B3);
        Duda.turmas.add(A1); Duda.turmas.add(A2); Duda.turmas.add(A3);
        Aline.turmas.add(B1); Aline.turmas.add(B2); Aline.turmas.add(B3);
        Ingride.turmas.add(A1); Ingride.turmas.add(A2); Ingride.turmas.add(A3);
        Manuel.turmas.add(B1); Manuel.turmas.add(B1); Manuel.turmas.add(B1);


        Aluno Joao = new Aluno ("2548", "1º ano", "João", "São Marcos, Salvador, Bahia", "71 99999-8129");
        Joao.setTurma(A1);
        Aluno Giulia = new Aluno ("7231", "1º ano", "Giulia", "São Cristovão, Salvador, Bahia", "71 99999-4591");
        Giulia.setTurma(B1);
        Aluno Maria = new Aluno ("1235", "2º ano", "Maria", "São Marcos, Salvador, Bahia", "71 99999-7851");
        Maria.setTurma(B2);
        Aluno Priscila = new Aluno ("4282", "2º ano", "Priscila", "Mussurunga, Salvador, Bahia", "71 99999-9865");
        Priscila.setTurma(A2);
        Aluno Gustavo = new Aluno ("2452", "3º ano", "Gustavo", "Itaigara, Salvador, Bahia", "71 99999-2546");
        Gustavo.setTurma(A3);
        Aluno Gabriel = new Aluno ("5647", "3º ano", "Gabriel", "Sete de Abril, Salvador, Bahia", "71 99999-4137");
        Gabriel.setTurma(B3);
        Aluno Vitoria = new Aluno ("7865", "3º ano", "Vitória", "Cajazeiras, Salvador, Bahia", "71 99999-7529");
        Vitoria.setTurma(B3);
        Aluno Camilla = new Aluno ("4287", "3º ano", "Camilla", "Paralela, Salvador, Bahia", "71 99999-6410");
        Camilla.setTurma(A3);

        this.Alunos.add(Joao);//adicionando no arraylist
        this.Alunos.add(Gabriel);
        this.Alunos.add(Giulia);
        this.Alunos.add(Gustavo);
        this.Alunos.add(Maria);
        this.Alunos.add(Priscila);
        this.Alunos.add(Vitoria);
        this.Alunos.add(Camilla);

        A1.ListaTurma.add("Joao");
        A1.quantAluno();
        B1.ListaTurma.add("Giulia");
        B1.quantAluno();
        A2.ListaTurma.add("Priscila");
        A2.quantAluno();
        B2.ListaTurma.add("Maria");
        B2.quantAluno();
        A3.ListaTurma.add("Gustavo");
        A3.quantAluno();
        A3.ListaTurma.add("Camilla");
        A3.quantAluno();
        B3.ListaTurma.add("Gabriel");
        B3.quantAluno();
        B3.ListaTurma.add("Camilla");
        B3.quantAluno();


    }
    public void buscarProfessor( ){
        System.out.println("-----------------------BUSCA DE PROFESSORES----------------------");
        System.out.println("Digite o código do professor?");
        leitor = new Scanner(System.in);
        String codigoProfessor = leitor.nextLine();

        for (int i = 0; i < professores.size(); i ++) {
            if(this.professores.get(i).getCodigoProfessor().equals(codigoProfessor)) {
                System.out.println(this.professores.get(i).toString());
            }else{
                System.out.println("Código do professor inválido");
            }
        }
    }
    public void buscarAluno( ) { //
        System.out.println("-----------------------BUSCA DE ALUNOS----------------------");
        System.out.println("Digite o código do Aluno?");
        leitor = new Scanner(System.in);
        String codigoAluno = leitor.nextLine();
        for (int i = 0; i < Alunos.size(); i ++) {
            if(this.Alunos.get(i).getCodigoAluno().equals(codigoAluno)) {
                System.out.println(this.Alunos.get(i).toString());
            }else{
                System.out.println("Código do aluno  inválido");
            }
        }
    }
    public void buscarDisciplina(){
        System.out.println("-----------------------BUSCA DE DISCIPLINAS----------------------");
        System.out.println("Digite o código da disciplina?");
        leitor = new Scanner(System.in);
        String codigoDiciplina = leitor.nextLine();
        for (int i = 0; i < disciplinas.size(); i ++) {
            if(this.disciplinas.get(i).getCodigoDisciplina().equals(codigoDiciplina)) {
                System.out.println(this.disciplinas.get(i).toString());
            }else{
                System.out.println("Código da disciplina inválido");
            }
        }

    }
    public void buscarTurma(){
        System.out.println("-----------------------BUSCA DE TURMAS----------------------");
        System.out.println("Digite o código da turma");
        leitor = new Scanner(System.in);
        String CodigoTurma = leitor.nextLine();
        for (int i = 0; i < Turmas.size(); i ++) {
            if(this.Turmas.get(i).getCodigoTurma().equals(CodigoTurma)) {
                System.out.println(this.Turmas.get(i).toString());
            }else{
                System.out.println("Código da turma inválido");
            }
        }

    }
    public void listaDeAlunos() {
        System.out.println("-----------------------LISTA DE ALUNOS----------------------");
            for (int i = 0; i < Alunos.size(); i++) {
                System.out.println("Aluno: " + Alunos.get(i).getNome()+" | Código: "+Alunos.get(i).getCodigoAluno()+" | Série: "+Alunos.get(i).getSerie());
            }
    }
    public void listaDeProfessores(){
        System.out.println("-----------------------LISTA DE PROFESSORES----------------------");
        for(int i = 0; i < professores.size(); i++){
            System.out.println("Professor: " + professores.get(i).getNome()+" | Código: "+professores.get(i).getCodigoProfessor()+" | Disciplina: "+professores.get(i).getDisciplina().getNome());
        }
    }
    public void listaDeDisciplinas(){
        System.out.println("-----------------------LISTA DE DISCIPLINAS----------------------");
        for(int i = 0; i < disciplinas.size(); i++){
            System.out.println(disciplinas.get(i).toString());
        }
    }
    public void listaDeTurma(){
        System.out.println("-----------------------LISTA DE TURMAS----------------------");
        for(int i = 0 ; i <Turmas.size(); i++){
            System.out.println(Turmas.get(i).toString());
        }
    }
    public void listaAlunosDaTurma(){
        System.out.println("-----------------------LISTA DE ALUNOS DA TURMA----------------------");
        System.out.println("Digite o codigo da turma");
        leitor = new Scanner(System.in);
        String codigoTurma = leitor.nextLine();
        for(int i = 0; i < Turmas.size(); i++){
            if(this.Turmas.get(i).getCodigoTurma().equals(codigoTurma)){
                this.Turmas.get(i).alunosDaTurma();
            }
        }
    }
    public void removerAluno(){
        System.out.println("-----------------------REMOÇÃO DE ALUNO----------------------");
        System.out.println("Digite o codigo do aluno");
        leitor = new Scanner(System.in);
        String codigoAluno = leitor.nextLine();
        for (int i = 0; i < Alunos.size(); i ++) {
            if(this.Alunos.get(i).getCodigoAluno().equals(codigoAluno)) {
                System.out.println("Deseja mesmo realizar a remoção do aluno? Sim ou Não");
                leitor = new Scanner(System.in);
                String resposta = leitor.nextLine();
                if(resposta.equals("S") || resposta.equals("Sim") || resposta.equals("sim") || resposta.equals("s")){
                    this.Alunos.get(i).turma.ListaTurma.remove(Alunos.get(i));
                    this.Alunos.get(i).turma.quantAlunoRemovido();
                    this.Alunos.remove(this.Alunos.get(i));
                    System.out.println("Aluno removido com sucesso!");
                    listaDeAlunos();
                }else{
                    System.out.println("Aluno não será removido!");
                }
            }else{
                System.out.println("Código do aluno inválido");
            }
        }
    }
    public void alterarAluno() {
        System.out.println("-----------------------ALTERAÇÃO DE ALUNO----------------------");
        System.out.println("Digite o codigo do Aluno que deseja modificar");
        leitor = new Scanner(System.in);
        String codigoAluno = leitor.nextLine();
        for(int i = 0; i < Alunos.size(); i++){
            if(this.Alunos.get(i).getCodigoAluno().equals(codigoAluno)){
                System.out.println("Digite o que deseja modificar do Aluno");
                System.out.println("Aluno: " + Alunos.get(i).getNome()+" \n Endereço: "+Alunos.get(i).getEndereco()+" \n Telefone: "+Alunos.get(i).getTelefone()+" \n Série: "+Alunos.get(i).getSerie()+" \n Turma: "+Alunos.get(i).getTurma());
                System.out.println("1 - Sair");
                System.out.println("2 - Nome");
                System.out.println("3 - Endereço");
                System.out.println("4 - Telefone");
                System.out.println("5 - Série");
                System.out.println("6 - Turma");
                leitor = new Scanner(System.in);
                int opt = leitor.nextInt();
                if (opt == 1) {
                    System.out.println("Sistema finalizando.");
                    break;
                } else if (opt == 2) {
                    System.out.println("Digite o Nome que deseja colocar:");
                    leitor = new Scanner(System.in);
                    String novoName = leitor.nextLine();
                    Alunos.get(i).setNome(novoName);
                    System.out.println("Nome modificado com sucesso.");
                } else if (opt == 3) {
                    System.out.println("Digite o Endereço que deseja colocar:");
                    leitor = new Scanner(System.in);
                    String novoEndereco = leitor.nextLine();
                    Alunos.get(i).setEndereco(novoEndereco);
                    System.out.println("Endereço modificado com sucesso.");
                } else if (opt == 4) {
                    System.out.println("Digite o Telefone que deseja colocar:");
                    leitor = new Scanner(System.in);
                    String novoTelefone = leitor.nextLine();
                    Alunos.get(i).setTelefone(novoTelefone);
                    System.out.println("Telefone modificado com sucesso.");
                } else if (opt == 5) {
                    System.out.println("Digite a Série que deseja colocar:");
                    leitor = new Scanner(System.in);
                    String novaSerie = leitor.nextLine();
                    Alunos.get(i).setSerie(novaSerie);
                    System.out.println("Série modificada com sucesso.");
                    System.out.println("Altere a turma do aluno.");
                } else if(opt == 6){
                    this.Alunos.get(i).turma.ListaTurma.remove(Alunos.get(i).getNome());
                    this.Alunos.get(i).turma.quantAlunoRemovido();
                    System.out.println("Digite o codigo da nova turma");
                    leitor = new Scanner(System.in);
                    String codigoTurma = leitor.nextLine();
                    for(int j = 0; j < this.Turmas.size(); j++) {
                        if (this.Turmas.get(j).getCodigoTurma().equals(codigoTurma)) {
                            this.Alunos.get(i).setTurma(this.Turmas.get(j));
                            this.Turmas.get(j).quantAluno();
                            this.Turmas.get(j).setListaTurma(this.Alunos.get(i).getNome());
                            System.out.println(Alunos.get(i));
                            System.out.println("Aluno cadastrado na turma com sucesso");
                        }
                    }
                }
            }else{
                System.out.println("Código do aluno ou turma inválido");
            }
        }
    }
}