package exercicios.aula19;


public class ex04 {

	public static void main(String[] args) {
		int[] x = new int[15];
		int[] z = new int[15];
		
		int i;
		
		for(i = 0; i < 15; i++) {
			x[i] = i + 1;
			System.out.println(i+"x = " + x[i]);
			z[i] = (int) Math.sqrt(x[i]);
			System.out.println("\ty = " + z[i]);
		}

	}

}
