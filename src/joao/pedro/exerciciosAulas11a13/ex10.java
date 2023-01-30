package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===========================GRAUS===========================\n\n");
		System.out.println("Insira os graus em °C e receba em °F: ");
		double celsius = scan.nextDouble();
		double farenheit = ((celsius * 9/5)+32);
		System.out.println(celsius + " graus °C são iguais a " + farenheit + " °F graus");
	}
}
