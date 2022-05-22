package Projeto;

import Projeto.EntidadeEscolar;

public class Main {
    public static void main(String[] args) {

        Secretaria sc  = new Secretaria("Luciana", "Salvador", "71 99999-9999");


        Disciplina Matematica = new Disciplina("Matemática", "Mat1234", "Matemática e suas tecnologias");
        Disciplina Portugues = new Disciplina("Português", "Port1234", "Linguagens, Códigos e suas Tecnologias");
        Disciplina Historia = new Disciplina("História", "Hist1234", "Ciências Humanas");
        Professor Pedro = new Professor("P1234", "Pedro", "Castelo Branco, Salvador, Bahia", "71 99912-3185");
        Professor Leila = new Professor("L1234", "Leila", "Cajazeiras 5, Salvador, Bahia", "71 98752-9123");
        Professor Jessica = new Professor("J1234", "Jessica", "Itapuã, Salvador, Bahia", "71 98825-6791");
        Professor Carlos = new Professor("C1234", "Carlos", "Itaigara, Salvador, Bahia", "71 99214-3576");
        Turma A1 = new Turma("1A");
        Turma A2 = new Turma("2A");
        Turma B1 = new Turma("1B");
        Aluno Joao = new Aluno ("2548", "1º ano", "João", "São Marcos, Salvador, Bahia", "71 99999-8129");
        sc.cadastrarAlunos(Joao);
        sc.cadastrarDisciplina(Matematica);
        sc.cadastrarDisciplina(Portugues);
        sc.cadastrarDisciplina(Historia);
        sc.cadastrarProfessor(Pedro);
        //sc.cadastrarProfessor(Leila);
        //sc.cadastrarProfessor(Jessica);
        //sc.cadastrarProfessor(Carlos);
        sc.cadastrarTurma(A1);
        sc.cadastrarTurma(A2);
        sc.cadastrarTurma(B1);

        //sc.cadastrarAlunoTurma(Joao,A1);
        //sc.cadastrarProfessorTurma();
        //sc.cadastrarProfessorTurma(Pedro, A2);
        //sc.cadastrarDisciplina();
        //sc.cadastrarProfessor();
        //sc.cadastrarProfessorDisciplina();
        //System.out.println(Pedro.toString());
        //sc.cadastrarAluno();
        //sc.buscarAluno("2548");
        //sc.buscarProfessor("P1234");
        //sc.ListaDeAlunos();
        //sc.ListaDeProfessores();
        //sc.ListaDeDisciplinas();
        //sc.ListaDeTurma();
        //System.out.println(Matematica.toString());



    }
}