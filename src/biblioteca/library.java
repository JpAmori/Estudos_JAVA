package biblioteca;

import java.util.Scanner;

public class library {

	public static void main(String[] args) {
		
		int quantidade;
		int esc = 0;
		
		Scanner scan = new Scanner(System.in);
		book books = new book();
		
		do {
			System.out.println("\t\t BIBLIOTECA \n\n");
			
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar Livro");
			System.out.println("2 - Ler Livro");
			esc = scan.nextInt();
			
			switch(esc) {
			case 1:
				System.out.println("Insira os dados necessários: ");
				System.out.println("Nome: ");
				books.name = scan.nextLine();
				System.out.println("Genero: ");
				books.genre = scan.nextLine();
				System.out.println("Autor: ");
				books.author = scan.nextLine();
				System.out.println("Cor da capa: ");
				books.coverColor = scan.nextLine();
				
			}
			
		}while(esc != 0);

	}

}
