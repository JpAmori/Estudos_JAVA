package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int quant = 5;
		double[] fish = new double[5];
		double sum = 0;
		int i, x;
		
		System.out.println("PESQUEIRO DO ADÃO");
		for(i = 0; i < quant; i++) {
			System.out.println("Insira o peso do peixe " +(i+1)+ " em kilos : ");
			fish[i] = scan.nextDouble();
			if(fish[i] >= 50) {
				sum = sum + 4;
				System.out.println("Infelizmente você vai pagar multa");
			}
		}
		System.out.println("O valor total da multa será de " + sum + "R$");
	}

}
