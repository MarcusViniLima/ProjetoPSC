package Projeto;

import java.util.ArrayList;
import java.util.Scanner;
import Projeto.EntidadeEscolar;

public class Principal {
    public static void main(String[] args) {

        Secretaria sc = new Secretaria("Luciana", "Salvador", "71 99999-9999");

        System.out.println("-------SISTEMA INICIADO-------");
        do {
            System.out.println("Escolha a função:");
            System.out.println("1 - Sair");
            System.out.println("2 - Cadastrar aluno");
            System.out.println("3 - Listar alunos");
            System.out.println("4 - Buscar aluno");
            System.out.println("5 - Listar de Alunos da turma");
            System.out.println("6 - Buscar professor");
            System.out.println("7 - Listar de Professores");
            System.out.println("8 - Buscar disciplina");
            System.out.println("9 - Listar disciplina ");
            System.out.println("10 - Buscar turma");
            System.out.println("11 - Listagem de Turma");
            int opt = obterInteiroTec();
            if (opt == 1) {
                System.out.println("Sistema finalizando.");
                break;
            } else if (opt == 2) {
                System.out.println("Iniciando cadastro de alunos.");
                sc.cadastrarAluno();
            } else if (opt == 3) {
                System.out.println("Iniciando listagem de alunos.");
                sc.ListaDeAlunos();
            } else if (opt == 4) {
                System.out.println("Iniciando busca de aluno.");
                sc.buscarAluno();
            } else if (opt == 5) {
                System.out.println("Iniciando listagem de alunos da turma.");
                sc.ListaAlunosDaTurma();
            } else if (opt == 6) {
                System.out.println("Iniciando busca de professor.");
                sc.ListaDeProfessores();
            } else if (opt == 7) {
                System.out.println("Iniciando listagem de professor.");
                sc.cadastrarAlunoTurma();
            } else if (opt == 8) {
                System.out.println("Iniciando busca de disciplina.");
                sc.buscarDisciplina();
            } else if (opt == 9) {
                System.out.println("Iniciando listagem de disciplina.");
                sc.ListaDeDisciplinas();
            } else if (opt == 10) {
                System.out.println("Iniciando busca de turma.");
                sc.buscarTurma();
            } else if (opt == 11) {
                System.out.println("Iniciando listagem de turma.");
                sc.ListaDeTurma();
            }
        } while (true);
    }

    public static int obterInteiroTec() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }

    public static String obterStringTec() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }

}