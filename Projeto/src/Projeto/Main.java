package Projeto;

import Projeto.EntidadeEscolar;

public class Main {
    public static void main(String[] args) {

        Secretaria sc  = new Secretaria("Luciana", "Salvador", "71 99999-9999");

        Disciplina Matematica = new Disciplina("Matemática", "Mat1234", "Matemática e suas tecnologias");
        Professor Pedro = new Professor("P1234", "Pedro", "Castelo Branco, Salvador, Bahia", "71 99912-3185", Matematica);
        Turma A1 = new Turma("1A");

        sc.cadastrarProfessorTurma(Pedro, A1);
        System.out.println(Pedro.turmas);


    }
}