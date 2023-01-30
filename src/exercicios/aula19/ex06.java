package exercicios.aula19;

public class ex06 {

	public static void main(String[] args) {
		
		int[] number1 = new int[10];
		int[] number2 = new int[10];
		int[] number3 = new int[10];
		
		int i;
		
		for(i = 0; i < 10; i++) {
			number1[i] = i;
			number2[i] = i + number1[i];
			number3[i] = number1[i] + number2[i];
			System.out.println("A soma dos vetores é igual a: " + number3[i]);
			System.out.println("SOMA = " + number1[i] + " + " + number2[i] + " = " + number3[i] + "\n");
		}
		
	}

}
