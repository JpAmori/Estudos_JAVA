package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("A soma deste número é igual a: " + (n1+n2));
	}
}
