package n1exercici2;

public class Cotxe {
	final private static String marca = "Ferrari";
	private static String model;
	final private int potencia = 390;
	
	public Cotxe() {
		model = "Testarossa";
	}

	public static void frenar() {
		System.out.println("El vehicle està frenant");	
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
	
	public String get_model_cotxe() {
		return "El model del cotxe és: " + model;
	}
}