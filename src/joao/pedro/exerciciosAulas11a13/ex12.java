package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira sua altura: ");
		double high = scan.nextDouble();
		double weight = (72.7 * high) - 58;
		System.out.println("O peso ideal é: " + weight);

	}

}
