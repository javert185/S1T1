package n1exercici1;

abstract class instrument {
		
	private String nom_instrument;
	private int preu_instrument;	
	public abstract void tocar();
	
	static {
		System.out.println("Classe inicialitzada");
	}
	
	public static void metode_static(){
		System.out.println("Mètode static");				
	}
	
}
	
class vent extends instrument {
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
	}
}
	
class corda extends instrument{
	public void tocar() {
		System.out.println("Està sonant un instrument de corda");
	}
}
	
class percussio extends instrument{
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");
	}
}
