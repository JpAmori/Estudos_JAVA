package Estruturas_de_Dados;

public class arrays {

	public static void main(String[] args) {
		
		int[] number = new int[11];
		int i;
		
		for(i = 1; i < 11; i++) {
			number[i] = i;
			//System.out.println("Posição: " + i);
			System.out.println("Número: " + number[i]);
		}
	}

}
