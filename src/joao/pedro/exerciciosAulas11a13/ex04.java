package joao.pedro.exerciciosAulas11a13;

import java.util.Scanner;

public class ex04 {
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
		
		float media = (note1 + note2 + note3 + note4) / 4;
		
		System.out.println("\nA media das notas é: " + media);
	}
}
