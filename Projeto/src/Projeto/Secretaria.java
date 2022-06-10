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
        this.professores=new ArrayList<>();
        this.disciplinas=new ArrayList<>();
        this.Alunos=new ArrayList<>();
        this.Turmas = new ArrayList<>();
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
    public void cadastrarAlunoTurma() {
        System.out.println("-----------------------CADASTRAR O ALUNO NA TURMA------------------------");
        System.out.println("Digite o codigo do Aluno");
        leitor = new Scanner(System.in);
        String codigoAluno = leitor.nextLine();
        boolean resultado=false;
        for(int i = 0; i < Alunos.size(); i++){
            if(this.Alunos.get(i).getCodigoAluno().equals(codigoAluno)){
                System.out.println("Digite o codigo da turma");
                leitor = new Scanner(System.in);
                String codigoTurma = leitor.nextLine();
                boolean resultadoTurma=false;
                resultado = true;
                for(int j = 0; j < this.Turmas.size(); j++) {
                    if (this.Turmas.get(j).getCodigoTurma().equals(codigoTurma)) {
                        this.Alunos.get(i).setTurma(this.Turmas.get(j));
                        this.Turmas.get(j).quantAluno();
                        this.Turmas.get(j).setListaTurma(this.Alunos.get(i).getNome());
                        resultadoTurma = true;
                        System.out.println("Aluno cadastrado na turma com sucesso");
                    }
                }
                if(!resultadoTurma){
                    System.out.println("Código da turma inválido");
                }

            }
        }
        if(!resultado){
            System.out.println("Código do aluno inválido");
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

        Aluno Jonas = new Aluno ("7749", "1º ano", "Jonas", "Boca da Mata, Salvador, Bahia", "71 99999-5678");
        Jonas.setTurma(A1);
        this.Alunos.add(Jonas);
        A1.ListaTurma.add("Jonas");
        A1.quantAluno();

        Aluno Roberto = new Aluno ("3421", "1º ano", "Roberto", "Cassange, Salvador, Bahia", "71 99999-9010");
        Roberto.setTurma(A1);
        this.Alunos.add(Roberto);
        A1.ListaTurma.add("Roberto");
        A1.quantAluno();

        Aluno Erica = new Aluno ("6789", "1º ano", "Érica", "Barra, Salvador, Bahia", "71 99999-8971");
        Erica.setTurma(A1);
        this.Alunos.add(Erica);
        A1.ListaTurma.add("Érica");
        A1.quantAluno();

        Aluno Patricia = new Aluno ("8941", "1º ano", "Patrícia", "Lapa, Salvador, Bahia", "71 99999-1200");
        Patricia.setTurma(A1);
        this.Alunos.add(Patricia);
        A1.ListaTurma.add("Patrícia");
        A1.quantAluno();

        Aluno Karoline = new Aluno ("4300", "1º ano", "Karoline", "Piatã, Salvador, Bahia", "71 99999-2311");
        Karoline.setTurma(A1);
        this.Alunos.add(Karoline);
        A1.ListaTurma.add("Karoline");
        A1.quantAluno();

        Aluno Sandra = new Aluno ("3211", "1º ano", "Sandra", "Sussurana, Salvador, Bahia", "71 99999-2203");
        Sandra.setTurma(A1);
        this.Alunos.add(Sandra);
        A1.ListaTurma.add("Sandra");
        A1.quantAluno();

        Aluno Ricardito = new Aluno ("4779", "3º ano", "Ricardito", "Imbuí, Salvador, Bahia", "71 99999-6420");
        Ricardito.setTurma(A3);
        Aluno Garfield = new Aluno ("5743", "3º ano", "Garfield", "Bairro da Paz, Salvador, Bahia", "71 99999-8419");
        Garfield.setTurma(A3);
        Aluno Romulo = new Aluno ("7273", "3º ano", "Romulo", "São Cristovão, Salvador, Bahia", "71 99999-9753");
        Romulo.setTurma(A3);
        Aluno Barbara = new Aluno ("2534", "3º ano", "Barbara", "Paralela, Salvador, Bahia", "71 99999-6982");
        Barbara.setTurma(A3);
        Aluno Emma = new Aluno ("4860", "3º ano", "Emma", "Bairro da Paz, Salvador, Bahia", "71 99999-2473");
        Emma.setTurma(A3);

        this.Alunos.add(Ricardito);
        this.Alunos.add(Garfield);
        this.Alunos.add(Romulo);
        this.Alunos.add(Barbara);
        this.Alunos.add(Emma);

        A3.ListaTurma.add("Ricardito");
        A3.quantAluno();
        A3.ListaTurma.add("Garfield");
        A3.quantAluno();
        A3.ListaTurma.add("Romulo");
        A3.quantAluno();
        A3.ListaTurma.add("Barbara");
        A3.quantAluno();
        A3.ListaTurma.add("Emma");
        A3.quantAluno();


        Aluno Ferdinando = new Aluno ("9090", "2º ano", "Ferdinando", "Barra, Salvador, Bahia", "71 99999-1441");
        Ferdinando.setTurma(A2);
        Aluno Geraldine = new Aluno ("4501", "2º ano", "Geraldine", "Pituba, Salvador, Bahia", "71 99999-9153");
        Geraldine.setTurma(A2);
        Aluno Oliver = new Aluno ("5323", "2º ano", "Oliver", "Costa Azul, Salvador, Bahia", "71 99999-7719");
        Oliver.setTurma(A2);
        Aluno Norton = new Aluno ("3780", "2º ano", "Norton", "Paralela, Salvador, Bahia", "71 99999-0120");
        Norton.setTurma(A2);
        Aluno Celine = new Aluno ("1957", "2º ano", "Celine", "Lapa, Salvador, Bahia", "71 99999-8532");
        Celine.setTurma(A2);
        Aluno Dionisio = new Aluno ("7776", "2º ano", "Dionisio", "Barra, Salvador, Bahia", "71 99999-8778");
        Dionisio.setTurma(A2);

        this.Alunos.add(Ferdinando);
        this.Alunos.add(Geraldine);
        this.Alunos.add(Oliver);
        this.Alunos.add(Norton);
        this.Alunos.add(Celine);
        this.Alunos.add(Dionisio);

        A2.ListaTurma.add("Ferdinando");
        A2.quantAluno();
        A2.ListaTurma.add("Geraldine");
        A2.quantAluno();
        A2.ListaTurma.add("Oliver");
        A2.quantAluno();
        A2.ListaTurma.add("Norton");
        A2.quantAluno();
        A2.ListaTurma.add("Celine");
        A2.quantAluno();
        A2.ListaTurma.add("Dionisio");
        A2.quantAluno();

        Aluno Francisco = new Aluno ("4554", "2º ano", "Francisco", "Liberdade, Salvador, Bahia", "71 99999-4114");
        Francisco.setTurma(B2);
        Aluno George = new Aluno ("5559", "2º ano", "George", "Itapuã, Salvador, Bahia", "71 99999-1155");
        George.setTurma(B2);
        Aluno Jaime = new Aluno ("9997", "2º ano", "Jaime", "Brotas, Salvador, Bahia", "71 99999-3999");
        Jaime.setTurma(B2);
        Aluno Maicon = new Aluno ("7677", "2º ano", "Maicon", "Cajazeiras, Salvador, Bahia", "71 99999-4666");
        Maicon.setTurma(B2);
        Aluno Cleiton = new Aluno ("4559", "2º ano", "Cleiton", "Stiep, Salvador, Bahia", "71 99999-5535");
        Cleiton.setTurma(B2);
        Aluno Matias = new Aluno ("5703", "2º ano", "Matias", "Pituba, Salvador, Bahia", "71 99999-3353");
        Matias.setTurma(B2);

        this.Alunos.add(Francisco);
        this.Alunos.add(George);
        this.Alunos.add(Jaime);
        this.Alunos.add(Maicon);
        this.Alunos.add(Cleiton);
        this.Alunos.add(Matias);

        B2.ListaTurma.add("Francisco");
        B2.quantAluno();
        B2.ListaTurma.add("George");
        B2.quantAluno();
        B2.ListaTurma.add("Jaime");
        B2.quantAluno();
        B2.ListaTurma.add("Maicon");
        B2.quantAluno();
        B2.ListaTurma.add("Cleiton");
        B2.quantAluno();
        B2.ListaTurma.add("Matias");
        B2.quantAluno();


        Aluno Monica = new Aluno ("4798", "3º ano", "Monica", "Barra, Salvador, Bahia", "71 99921-6428");
        Monica.setTurma(B3);
        Aluno Rachel = new Aluno ("2343", "3º ano", "Rachel ", "Pituba Salvador, Bahia", "71 99958-1419");
        Rachel.setTurma(B3);
        Aluno Molly = new Aluno ("7283", "3º ano", "Molly ", "Pirajá, Salvador, Bahia", "71 99579-9757");
        Molly.setTurma(B3);
        Aluno Tadeu = new Aluno ("2789", "3º ano", "Tadeu ", "Cabula, Salvador, Bahia", "71 99679-6282");
        Tadeu.setTurma(B3);
        Aluno Eva = new Aluno ("4032", "3º ano", "Eva ", "Cabula, Salvador, Bahia", "71 99970-2453");
        Eva.setTurma(B3);

        this.Alunos.add(Monica);
        this.Alunos.add(Garfield);
        this.Alunos.add(Romulo);
        this.Alunos.add(Barbara);
        this.Alunos.add(Emma);

        B3.ListaTurma.add("Monica");
        B3.quantAluno();
        B3.ListaTurma.add("Rachel");
        B3.quantAluno();
        B3.ListaTurma.add("Molly");
        B3.quantAluno();
        B3.ListaTurma.add("Tadeu");
        B3.quantAluno();
        B3.ListaTurma.add("Eva");
        B3.quantAluno();


        Aluno Regivaldo = new Aluno ("2211", "1º ano", "Regivaldo", "Valéria, Salvador, Bahia", "71 99999-4567");
        Regivaldo.setTurma(B1);
        this.Alunos.add(Regivaldo);
        B1.ListaTurma.add("Regivaldo");
        B1.quantAluno();

        Aluno Silvio = new Aluno ("3289", "1º ano", "Silvio", "Corredor da Vitória, Salvador, Bahia", "71 99999-4519");
        Silvio.setTurma(B1);
        this.Alunos.add(Silvio);
        B1.ListaTurma.add("Silvio");
        B1.quantAluno();

        Aluno Robson = new Aluno ("2318", "1º ano", "Robson", "Pirajá, Salvador, Bahia", "71 99999-2314");
        Robson.setTurma(B1);
        this.Alunos.add(Robson);
        B1.ListaTurma.add("Robson");
        B1.quantAluno();

        Aluno Manuela = new Aluno ("2019", "1º ano", "Manuela", "Itapuã, Salvador, Bahia", "71 99999-2314");
        Manuela.setTurma(B1);
        this.Alunos.add(Manuela);
        B1.ListaTurma.add("Manuela");
        B1.quantAluno();

        Aluno Gilvan = new Aluno ("2567", "1º ano", "Gilvan", "Imbuí, Salvador, Bahia", "71 99999-2314");
        Gilvan.setTurma(B1);
        this.Alunos.add(Gilvan);
        B1.ListaTurma.add("Gilvan");
        B1.quantAluno();


    }
    public void buscarProfessor( ){
        boolean resultado=false;
        System.out.println("-----------------------BUSCA DE PROFESSORES----------------------");
        System.out.println("Digite o código do professor?");
        leitor = new Scanner(System.in);
        String codigoProfessor = leitor.nextLine();

        for (int i = 0; i < professores.size(); i ++) {
            if(this.professores.get(i).getCodigoProfessor().equals(codigoProfessor)) {
                System.out.println(this.professores.get(i).toString());
                resultado=true;
            }
        }
        if(!resultado){
            System.out.println("Código do professor inválido");
        }
    }
    public void buscarAluno( ) { //
        boolean resultado=false;
        System.out.println("-----------------------BUSCA DE ALUNOS----------------------");
        System.out.println("Digite o código do Aluno?");
        leitor = new Scanner(System.in);
        String codigoAluno = leitor.nextLine();
        for (int i = 0; i < Alunos.size(); i ++) {
            if(this.Alunos.get(i).getCodigoAluno().equals(codigoAluno)) {
                System.out.println(this.Alunos.get(i).toString());
                resultado=true;
            }
        }
        if(!resultado){
            System.out.println("Código do aluno inválido");
        }
    }
    public void buscarDisciplina() {
        boolean resultado = false;
        System.out.println("-----------------------BUSCA DE DISCIPLINAS----------------------");
        System.out.println("Digite o código da disciplina?");
        leitor = new Scanner(System.in);
        String codigoDiciplina = leitor.nextLine();
        for (int i = 0; i < disciplinas.size(); i++) {
            if (this.disciplinas.get(i).getCodigoDisciplina().equals(codigoDiciplina)) {
                System.out.println(this.disciplinas.get(i).toString());
                resultado = true;
            }
        }
        if (!resultado) {
            System.out.println("Código da disciplina inválido");
        }
    }
    public void buscarTurma(){
            boolean resultado=false;
            System.out.println("-----------------------BUSCA DE TURMAS----------------------");
        System.out.println("Digite o código da turma");
        leitor = new Scanner(System.in);
        String CodigoTurma = leitor.nextLine();
        for (int i = 0; i < Turmas.size(); i ++) {
            if(this.Turmas.get(i).getCodigoTurma().equals(CodigoTurma)) {
                System.out.println(this.Turmas.get(i).toString());
                resultado=true;
            }
        }
            if(!resultado){
                System.out.println("Código da disciplina inválido");
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
        boolean resultado = false;
        for(int i = 0; i < Turmas.size(); i++){
            if(this.Turmas.get(i).getCodigoTurma().equals(codigoTurma)){
                this.Turmas.get(i).alunosDaTurma();
                resultado = true;
            }
        }
        if(!resultado){
            System.out.println("Código da turma inválido");
        }

    }
    public void removerAluno(){
        boolean resultado=false;
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
                    resultado=true;
                }else{
                    System.out.println("Aluno não será removido!");
                }
            }
        }
        if(!resultado){
            System.out.println("Código do aluno inválido");
        }

    }
    public void alterarAluno() {
        System.out.println("-----------------------ALTERAÇÃO DE ALUNO----------------------");
        System.out.println("Digite o codigo do Aluno que deseja modificar");
        leitor = new Scanner(System.in);
        String codigoAluno = leitor.nextLine();
        boolean resultado=false;
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
                    resultado=true;
                } else if (opt == 3) {
                    System.out.println("Digite o Endereço que deseja colocar:");
                    leitor = new Scanner(System.in);
                    String novoEndereco = leitor.nextLine();
                    Alunos.get(i).setEndereco(novoEndereco);
                    System.out.println("Endereço modificado com sucesso.");
                    resultado=true;
                } else if (opt == 4) {
                    System.out.println("Digite o Telefone que deseja colocar:");
                    leitor = new Scanner(System.in);
                    String novoTelefone = leitor.nextLine();
                    Alunos.get(i).setTelefone(novoTelefone);
                    System.out.println("Telefone modificado com sucesso.");
                    resultado=true;
                } else if (opt == 5) {
                    System.out.println("Digite a Série que deseja colocar:");
                    leitor = new Scanner(System.in);
                    String novaSerie = leitor.nextLine();
                    Alunos.get(i).setSerie(novaSerie);
                    System.out.println("Série modificada com sucesso.");
                    System.out.println("Altere a turma do aluno.");
                    resultado=true;
                } else if(opt == 6){
                    this.Alunos.get(i).turma.ListaTurma.remove(Alunos.get(i).getNome());
                    this.Alunos.get(i).turma.quantAlunoRemovido();
                    System.out.println("Digite o codigo da nova turma");
                    leitor = new Scanner(System.in);
                    boolean resultadoTurma =false;
                    String codigoTurma = leitor.nextLine();
                    for(int j = 0; j < this.Turmas.size(); j++) {
                        if (this.Turmas.get(j).getCodigoTurma().equals(codigoTurma)) {
                            this.Alunos.get(i).setTurma(this.Turmas.get(j));
                            this.Turmas.get(j).quantAluno();
                            this.Turmas.get(j).setListaTurma(this.Alunos.get(i).getNome());
                            resultado=true;
                            resultadoTurma = true;
                            System.out.println(Alunos.get(i));
                            System.out.println("Aluno cadastrado na turma com sucesso");
                        }
                    }
                    if(!resultadoTurma){
                        System.out.println("Código da turma inválido");
                    }

                }
            }
        }
        if(!resultado){
            System.out.println("Código do aluno inválido");
        }

    }
}