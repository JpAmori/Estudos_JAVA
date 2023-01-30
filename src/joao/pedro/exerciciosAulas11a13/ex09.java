package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===========================GRAUS===========================\n\n");
		System.out.println("Insira os graus em °F e receba em °C: ");
		double farenheit = scan.nextDouble();
		double celsius = (5*(farenheit-32)/9);
		System.out.println(farenheit + " graus °F são " + celsius + " graus °C");

	}

}
