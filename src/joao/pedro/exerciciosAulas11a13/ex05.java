package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira quantos metros deseja converter: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros*100;
		
		System.out.println(metros + " Em centimetros é igual á: " + centimetros + " cm");
	}

}
