package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio para calcularmos a área: ");
		double raion = scan.nextDouble();
		
		double area = 3.14*(raion*raion);
		System.out.println("A área calculada com base neste raio é igual a: " + area);

	}

}
