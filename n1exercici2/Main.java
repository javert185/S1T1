package n1exercici2;

public class Main {
	
	public static void main(String[] args) {
		
		//Creem un objecte cotxe
		Cotxe cotxe1 = new Cotxe();
		
		//Imprimim per pantalla
		System.out.println(cotxe1.get_model_cotxe());
		
		//Invoquem el m�tode static frenar
		Cotxe.frenar();
		
		//Invoquem el m�tode accelerar
		cotxe1.accelerar();		
	}
}