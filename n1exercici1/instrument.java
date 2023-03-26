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