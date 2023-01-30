package joao.pedro.aula12;
import java.util.Scanner;

public class receivingDataFromthekeyboard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nameComplete = scan.nextLine();
		System.out.println("Seu nome completo é: " + nameComplete);
		
		System.out.println("\nDigite o seu primeiro nome: ");
		String firstName = scan.next();
		System.out.println("Seu primeiro nome é: " + firstName);
		
		System.out.println("\nDigite sua idade: ");
		int age = scan.nextInt();
		System.out.println("Sua idade é: " + age + " anos");
	}

}
