package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu sexo, M (masculino) ou F (feminino): ");
		String gener = scan.next();
		System.out.println("Insira sua altura: ");
		double high = scan.nextDouble();
		
		if(gener == "M") {
			double weightM = (72.7 * high) - 58;
			System.out.println("O seu peso ideal é: " + weightM);
		}
		else if(gener == ""){
			double weightF = (62.1*high)-44.7;
			System.out.println("O seu peso ideal é: " + weightF);
		}
	}
}
