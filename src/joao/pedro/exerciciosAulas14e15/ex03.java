package joao.pedro.exerciciosAulas14e15;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o seu sexo M (Masculino) e F (Feminino): ");
		String sex = scan.next();
		
		if(sex == "M" || sex == "m") {
			System.out.println("Sexo Masculino");
		}
		else if(sex == "F" || sex == "f") {
			System.out.println("Sexo Feminino");
		}
		else {
			System.out.println("Sexo inválido");
		}

	}

}
