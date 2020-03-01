package batalla;

public class Trupalla extends Carro {
	
	private static int armadura;
	private static String nomConductor;
	

	public Trupalla() {
		
	}
	
	public Trupalla(int ocupantes,String fechaI,int fila, int column,int armadura,String conductor) {
		super(ocupantes,fechaI,fila,column);
		Trupalla.armadura=armadura;
		Trupalla.nomConductor=conductor;
	}
}