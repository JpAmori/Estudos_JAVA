package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex15 {

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
		System.out.println("O seu salário bruto é: " + wage + "R$");
		
		double descINSS = wage*8/(100);
		double sindicate = wage*5/(100);
		double impostodeRenda = wage*11/(100);
		
		System.out.println("a) O valor pago ao INSS = " + descINSS);
		System.out.println("b) O valor pago ao sindicato = " + sindicate);
		System.out.println("b) O salario Liquido = " + (wage - (descINSS + sindicate + impostodeRenda)));

	}

}
