package exercicios.aula19;

public class ex02 {

	public static void main(String[] args) {
		int[] x = new int[8];
		int[] z = new int[8];
		
		int i;
		
		for(i = 0; i < 8; i++) {
			x[i] = i + 1;
			System.out.println("x = " + x[i]);
			z[i] = x[i]*2;
			System.out.println("\ty = " + z[i]);
		}
	}
}
