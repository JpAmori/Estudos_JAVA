package exercicios.aula19;

public class ex05 {

	public static void main(String[] args) {
		int[] x = new int[10];
		int[] z = new int[10];
		
		int i;
		
		for(i = 0; i < 10; i++) {
			x[i] = i + 1;
			System.out.println(i+" - x = " + x[i]);
			z[i] = x[i]*i;
			System.out.println("\ty = " + z[i]);
		}

	}

}
