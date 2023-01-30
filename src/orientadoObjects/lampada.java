package orientadoObjects;

public class lampada {

	public static void main(String[] args) {
		
		orientacaoeObjetos lampada = new orientacaoeObjetos();
		
		lampada.supermercado = "Faria";
		lampada.marca = "CEMIG";
		lampada.modelo = "212 por 15";
		lampada.vats = 120;
		lampada.valor = 20;
		
		System.out.println("Supermercado = " + lampada.supermercado);
		System.out.println("Marca = " + lampada.marca);
		System.out.println("Modelo = " + lampada.modelo);
		System.out.println("Wats = " + lampada.vats);
		System.out.println(lampada.valor + " R$");
	}
}
