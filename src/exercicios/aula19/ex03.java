package exercicios.aula19;

public class ex03 {

	public static void main(String[] args) {
		int[] x = new int[15];
		int[] z = new int[15];
		
		int i;
		
		for(i = 0; i < 15; i++) {
			x[i] = i + 1;
			System.out.println("x = " + x[i]);
			z[i] = x[i] * x[i];
			System.out.println("\ty = " + z[i]);
		}


	}

}
