package joao.pedro.exerciciosAulas14e15;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a nota do 1° Bimestre: ");
		float note1 = scan.nextFloat();
		System.out.println("Insira a nota do 2° Bimestre: ");
		float note2 = scan.nextFloat();
		System.out.println("Insira a nota do 3° Bimestre: ");
		float note3 = scan.nextFloat();
		System.out.println("Insira a nota do 4° Bimestre: ");
		float note4 = scan.nextFloat();
		
		double media = (note1+note2+note3+note4)/4;
		
		if( media >= 10 ) {
			System.out.println("Aprovado com Distinção!");
		}
		else if( media >= 7 && media < 10 ) {
			System.out.println("Aprovado");
		}
		else if( media < 7 ) {
			System.out.println("Reprovado");
		}
		System.out.println("Sua média foi de " + media);

	}

}
