package Application;

import java.util.Scanner;

public class MenuOptions {

	public MenuOptions() {

	}

	public static int menu(Scanner sc) {
		System.out.println();
		System.out.println("Informe o seu tipo de usuário");
		System.out.println("-----------------------------");
		System.out.println("1 - Funcionário da secretária");
		System.out.println("2 - Aluno");
		System.out.println("3 - Professor");
		System.out.println("0 - Sair");
		int opc = Integer.parseInt(sc.nextLine());
		return opc;
	}

	public static int menuSecretary(Scanner sc) {
		System.out.println();
		System.out.println("Quais ações você deseja tomar");
		System.out.println("---------------------------------------------");
		System.out.println("1 - Manter informações sobre as disciplinas: ");
		System.out.println("2 - Manter informações sobre os alunos: ");
		System.out.println("3 - Manter informações sobre os professores: ");
		System.out.println("0 - Sair");
		int opc = Integer.parseInt(sc.nextLine());
		return opc;
	}

	public static int submenuClass(Scanner sc) {
		System.out.println();
		System.out.println("Quais ações você deseja tomar");
		System.out.println("-----------------------------");
		System.out.println("1 - Adicionar disciplina: ");
		System.out.println("2 - Remover disciplina: ");
		System.out.println("0 - Sair");
		int opc = Integer.parseInt(sc.nextLine());
		return opc;
	}

	public static int submenuStudent(Scanner sc) {
		System.out.println();
		System.out.println("Quais ações você deseja tomar");
		System.out.println("-----------------------------");
		System.out.println("1 - Adicionar aluno: ");
		System.out.println("2 - Remover aluno: ");
		System.out.println("0 - Sair");
		int opc = Integer.parseInt(sc.nextLine());
		return opc;
	}

	public static int submenuTeacher(Scanner sc) {
		System.out.println();
		System.out.println("Quais ações você deseja tomar");
		System.out.println("-----------------------------");
		System.out.println("1 - Adicionar professor: ");
		System.out.println("2 - Remover professor: ");
		System.out.println("0 - Sair");
		int opc = Integer.parseInt(sc.nextLine());
		return opc;
	}

	public void selectedMenu() {
		Scanner sc = new Scanner(System.in);
		int opc = menu(sc);
		int opcmenu;
		int opcSubmenu;

		do {
			switch (opc) {
			case 1:
				opcmenu = menuSecretary(sc);
				switch (opcmenu) {
				case 1:
					opcSubmenu = submenuClass(sc);

					switch (opcSubmenu) {
					case 1:
						System.out.println("açao de adicionar disciplina");
						opc = menu(sc);
						break;
					case 2:
						System.out.println("açao de remover disciplina");
						opc = menu(sc);
						break;
					}

				case 2:
					opcSubmenu = submenuStudent(sc);

					switch (opcSubmenu) {
					case 1:
						System.out.println("açao de adicionar aluno");
						opc = menu(sc);
						break;
					case 2:
						System.out.println("açao de remover aluno");
						opc = menu(sc);
						break;
					}

				case 3:
					opcSubmenu = submenuTeacher(sc);

					switch (opcSubmenu) {
					case 1:
						System.out.println("açao de adicionar professor");
						opc = menu(sc);
						break;
					case 2:
						System.out.println("açao de remover professor");
						opc = menu(sc);
						break;
					}

				}
				break;
			case 2:
				System.out.println("açao de fazer matricula");
				break;
			case 3:
				System.out.println("visualizar alunos matriculados en cada disciplina");
				break;
			}
		} while (opc != 0);
		sc.close();
	}
}
