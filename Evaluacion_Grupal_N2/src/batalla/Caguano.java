package batalla;

public class Caguano extends Carro {
	
	private static int alcanceTiro;
	private static String colorConfeti;
	
	/**
	 * Constructor por defecto
	 */
	public Caguano() {
		
	}

	/**
	 * Constructo con todos los parametros
	 * @param ocupantes
	 * @param fechaI
	 * @param fila
	 * @param column
	 * @param alcance
	 * @param colorConfe
	 */
	public Caguano(int ocupantes,String fechaI,int fila, int column,int alcance, String colorConfe) {
		super(ocupantes,fechaI,fila,column);
		Caguano.alcanceTiro=alcance;
		Caguano.colorConfeti=colorConfe;
		
	}
}
