package Estruturas_de_Dados;

import java.util.Random;

public class matrizes {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int colum = 0;
		int row = 0;
		int result = 0;
		Random rand = new Random();
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.print("Coluna "+(i+1)+ "\n");
			for(int x = 0; x < 3; x++) {
				matriz[i][x] = rand.nextInt(100);
				System.out.printf("Linha %d = %d \n", (x+1), matriz[i][x]);
				if(matriz[i][x] > result) {
					result = matriz[i][x];
					colum = i+1;
					row = x+1;
				}

			}
			System.out.printf("\n");
		}
		System.out.printf("O maior número está na Coluna %d e na linha %d = %d", colum, row, result);
	}
}
