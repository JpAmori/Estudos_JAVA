package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==============SUVINIL==========\n");
		
		System.out.println("Uma lata de tinta de 18l é equivalente a 3 metros quadrados e cada lata custa 80R$");
		System.out.println("Quantos metros serão pintados ? ");
		int metros = scan.nextInt();
		int cans = metros/3;
		if((metros % 3) == 1) {
			cans++;
		}
		double values = 80*cans;
		System.out.println("O valor a ser pago será de " + values + " R$");
	}

}
