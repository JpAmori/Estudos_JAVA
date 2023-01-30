package joao.pedro.exerciciosAulas14e15;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira dois números");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		if(n1 > n2) {
			System.out.println("O maior número é " + n1);
		}
		else if( n1 == n2) {
			System.out.println("Os dois números são iguais " + n1 + " e " + n2);
		}
		else {
			System.out.println("O maior número é " + n2);
		}
		
	}

}
