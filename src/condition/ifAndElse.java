package condition;

import java.util.Scanner;

public class ifAndElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira sua idade: ");
		int age = scan.nextInt();
		
		if(age < 18) {
			System.out.println("Você é menor de idade");
		}
		else {
			System.out.println("A mlk, você é de maior");
		}

	}

}
