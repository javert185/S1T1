package n1exercici1;

public class Main {

	public static void main(String[] args) {
		//Creem un objecte de vent i el toquem
		
		//Mètode static
		instrument.metode_static();
		
		Vent flauta = new Vent();
		flauta.tocar();
		
		// Creem un objecte de corda i el toquem
		Corda guitarra = new Corda();
		guitarra.tocar();
		
		// Creem un objecte de percussio i el toquem
		Percussio tambor = new Percussio();
		tambor.tocar();	
	}
}