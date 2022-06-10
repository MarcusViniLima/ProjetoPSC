package Projeto;

import java.util.Scanner;

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
            System.out.println("5 - Alterar dados de um aluno");
            System.out.println("6 - remover aluno");
            System.out.println("7 - Listar de Alunos da turma");
            System.out.println("8 - Buscar professor");
            System.out.println("9 - Listar de Professores");
            System.out.println("10 - Buscar disciplina");
            System.out.println("11 - Listar disciplina ");
            System.out.println("12 - Buscar turma");
            System.out.println("13 - Listagem de Turma");
            int opt = obterInteiroTec();
            if (opt == 1) {
                System.out.println("Sistema finalizando.");
                break;
            } else if (opt == 2) {
                System.out.println("Iniciando cadastro de alunos.");
                sc.cadastrarAluno();
            } else if (opt == 3) {
                System.out.println("Iniciando listagem de alunos.");
                sc.listaDeAlunos();
            } else if (opt == 4) {
                System.out.println("Iniciando busca de aluno.");
                sc.buscarAluno();
            }else if (opt == 5) {
                System.out.println("Iniciando alteração de dados de um aluno.");
                sc.alterarAluno();
            }else if (opt == 6) {
                System.out.println("Iniciando remoção de aluno.");
                sc.removerAluno();
            } else if (opt == 7) {
                System.out.println("Iniciando listagem de alunos da turma.");
                sc.listaAlunosDaTurma();
            } else if (opt == 8) {
                System.out.println("Iniciando busca de professor.");
                sc.buscarProfessor();
            } else if (opt == 9) {
                System.out.println("Iniciando listagem de professor.");
                sc.listaDeProfessores();
            } else if (opt == 10) {
                System.out.println("Iniciando busca de disciplina.");
                sc.buscarDisciplina();
            } else if (opt == 11) {
                System.out.println("Iniciando listagem de disciplina.");
                sc.listaDeDisciplinas();
            } else if (opt == 12) {
                System.out.println("Iniciando busca de turma.");
                sc.buscarTurma();
            } else if (opt == 13) {
                System.out.println("Iniciando listagem de turma.");
                sc.listaDeTurma();
            }
        } while (true);
    }

    public static int obterInteiroTec() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }
}