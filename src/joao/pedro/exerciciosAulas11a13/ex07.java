package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira qual o valor do comprimento do quadrado: ");
		double length = scan.nextDouble();
		
		double area = length*length;
		
		System.out.println("A área deste quadrado é igual á: " + area + " cm");
	}

}
