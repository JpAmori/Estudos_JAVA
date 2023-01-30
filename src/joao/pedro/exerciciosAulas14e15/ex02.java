package joao.pedro.exerciciosAulas14e15;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um número negativo ou positivo: ");
		int n1 = scan.nextInt();
		
		if(n1 < 0) {
			System.out.println("Este número é NEGATIVO");
		}
		else {
			System.out.println("Este número é POSITIVO");
		}

	}

}
