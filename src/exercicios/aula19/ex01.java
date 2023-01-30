package exercicios.aula19;

public class ex01 {

	public static void main(String[] args) {
		
		int[] x = new int[5];
		int[] z = new int[5];
		
		int i;
		
		for(i = 0; i < 5; i++) {
			x[i] = i + 1;
			System.out.println("x = " + x[i]);
			z[i] = x[i];
			System.out.println("\ty = " + z[i]);
		}

	}

}
