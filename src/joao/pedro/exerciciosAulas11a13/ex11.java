package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira dois números: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("Insira mais um número: ");
		double n3 = scan.nextDouble();
		
		
		System.out.println("a) O produto do dobro do primeiro com metade do segundo = " + (n1*2+(n2/2)));
		System.out.println("b) A soma do triplo do primeiro com o terceiro = " + (n1+n3*3));
		System.out.println("c) O terceiro elevado ao cubo = " + (n3*n3));
	}

}
