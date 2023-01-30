package condition;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int esc = 0;
		
		do {
			System.out.println("Insira o númedo do dia da semana: ");
			int day = scan.nextInt();
			
			switch(day) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-Feira");
				break;
			case 3:
				System.out.println("Terça-Feira");
				break;
			case 4:
				System.out.println("Quarta-Feira");
				break;
			case 5:
				System.out.println("Quinta-Feira");
				break;
			case 6:
				System.out.println("Sexta-Feira");
				break;
			case 7:
				System.out.println("Sabado");
				break;
			default:
				System.out.println("Dia inválido!");
				break;
			}
			
			System.out.println("Escolha:");
			System.out.println("1 - Sair");
			System.out.println("2 - Repetir");
			int escolha = scan.nextInt();
			
			esc = escolha;
			
		}while(esc != 1);
		System.out.println("Adeus");
	}
}
