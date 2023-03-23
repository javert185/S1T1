package n1exercici1;

public class Main {

	public static void main(String[] args) {
		//Creem un objecte de vent i el toquem
		
		//Mètode static
		instrument.metode_static();
		
		vent flauta = new vent();
		flauta.tocar();
		
		// Creem un objecte de corda i el toquem
		corda guitarra = new corda();
		guitarra.tocar();
		
		// Creem un objecte de percussio i el toquem
		percussio tambor = new percussio();
		tambor.tocar();	
		
		
		
		
	}
}
