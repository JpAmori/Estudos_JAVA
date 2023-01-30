package exercicios24;

import java.util.Scanner;

public class library {

	public static void main(String[] args) {
		
		book books = new book();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("\t\t Preencha os dados \n");
		System.out.println("Nome do Livro: ");
		books.name = scan.next();
		System.out.println("Nome do Autor: ");
		books.author = scan.next();
		System.out.println("Genero do Livro: ");
		books.gener = scan.next();
		System.out.println("Número de paginas: ");
		books.nPages = scan.nextInt();
		
		System.out.println("\n\t\tDados do livro\n");
		
		System.out.printf("Nome: %s\n", books.name);
		System.out.printf("Autor: %s\n", books.author);
		System.out.printf("Genero: %s\n", books.gener);
		System.out.printf("Número de paginas: %d\n", books.nPages);
		
	}

}
