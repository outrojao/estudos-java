package estudos;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("QUANTIDADE DE ALUNOS: ");
		int n = sc.nextInt();
		Student[] rooms = new Student[10];
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("DADOS DO " + (i + 1) + "º ALUNO:");
			Student student = new Student();

			System.out.print("NOME: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("EMAIL: ");
			String email = sc.nextLine();

			System.out.print("NÚMERO DO QUARTO (1-10): ");
			int room = sc.nextInt();

			student.setName(name);
			student.setEmail(email);
			while (rooms[room - 1] != null) {
				System.out.println("\nO QUARTO " + room + " JÁ ESTÁ OCUPADO, ESCOLHA OUTRO!");
				System.out.print("NÚMERO DO QUARTO (1-10): ");
				room = sc.nextInt();
			}
			student.setRoom(room);
			rooms[room - 1] = student;

			System.out.println("\nQUARTO " + room + " RESERVADO!\n");
		}

		System.out.println("HÓSPEDES:");
		for (Student guest : rooms) {
			if (guest != null) {
				System.out.printf("%d: %s, %s%n", guest.getRoom(), guest.getName(), guest.getEmail());
			}
		}

		sc.close();
	}
}
