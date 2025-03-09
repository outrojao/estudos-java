package estudos;

import java.util.Locale;
import java.util.Scanner;

//import entities.Product;
import entities.Person;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		System.out.print("QUANTIDADE DE PRODUTOS: ");
//		int n = sc.nextInt();
//		Product[] vect = new Product[n];
//		System.out.println();
//
//		for (int i = 0; i < n; i++) {
//			System.out.print("NOME DO PRODUTO: ");
//			String name = sc.nextLine();
//			sc.next();
//			System.out.print("PREÇO DO PRODUTO: ");
//			double price = sc.nextDouble();
//			Product product = new Product();
//			product.setName(name);
//			product.setPrice(price);
//			vect[i] = product;
//			System.out.println();
//		}
//
//		double sum = 0.0;
//		for (int i = 0; i < n; i++) {
//			sum += vect[i].getPrice();
//		}
//		double avg = sum / n;
//
//		System.out.println("MÉDIA DE PREÇOS: " + avg);

//		System.out.print("QUANTIDADE DE NÚMEROS INTEIROS: ");
//		int n = sc.nextInt();
//		int[] vect = new int[n];
//		System.out.println();
//		
//		for (int i = 0; i < n; i++) {
//			vect[i] = sc.nextInt();
//		}
//		
//		System.out.println("NÚMEROS NEGATIVOS:");
//		for (int i = 0; i < n; i++) {
//			if(vect[i] < 0) {
//				System.out.println(vect[i]);
//			}
//		}	

//		System.out.print("QUANTIDADE DE PESSOAS: ");
//		int n = sc.nextInt();
//
//		Person[] vect = new Person[n];
//
//		for (int i = 0; i < n; i++) {
//			System.out.println("DADOS DA " + (i + 1) + "ª PESSOA:");
//			Person person = new Person();
//
//			System.out.print("NOME: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//
//			System.out.print("IDADE: ");
//			int age = sc.nextInt();
//
//			System.out.print("ALTURA: ");
//			double height = sc.nextDouble();
//
//			person.setName(name);
//			person.setAge(age);
//			person.setHeight(height);
//
//			vect[i] = person;
//			System.out.println();
//		}
//
//		int qtd16 = 0;
//		System.out.println("PESSOAS COM MENOS DE 16:");
//		for (int i = 0; i < n; i++) {
//			if (vect[i].getAge() < 16) {
//				qtd16++;
//				System.out.println(vect[i].getName());
//			}
//		}
//
//		double percent16 = 100 * qtd16 / n;
//		System.out.println("EQUIVALE A " + percent16 + "%!");

		System.out.print("QUANTIDADE DE PESSOAS: ");
		int n = sc.nextInt();
		sc.nextLine();

		Person[] vect = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.println("DADOS DA " + (i + 1) + "ª PESSOA:");
			Person person = new Person();

			System.out.print("NOME: ");
			String name = sc.nextLine();

			System.out.print("IDADE: ");
			int age = sc.nextInt();
			sc.nextLine();

			person.setName(name);
			person.setAge(age);

			vect[i] = person;
			System.out.println();
		}

		int idade = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i].getAge() > idade) {
				idade = vect[i].getAge();
			}
		}
		System.out.println(idade);

		sc.close();
	}
}
