package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===========================SALARIO===========================\n\n");
		System.out.println("Insira quantos reais você ganha por hora: ");
		double value = scan.nextDouble();
		System.out.println("Insira quantas horas você trabalha por dia: ");
		int hours = scan.nextInt();
		System.out.println("Insira quantos dias você trabalha por mês: ");
		int days = scan.nextInt();
		
		double wage = (value*hours)*days;
		System.out.println("Você ganha " + wage + "R$ por mês");

	}

}
