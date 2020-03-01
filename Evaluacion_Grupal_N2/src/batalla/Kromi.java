package batalla;

public class Kromi extends Carro {
	
	private static int aFabricacion;
	private static String marca;
	
	public Kromi() {
		
	}
	
	/**
	 * Constructor con 6 parametros
	 * @param ocupantes
	 * @param fechaI
	 * @param fila
	 * @param column
	 * @param aFabric
	 * @param marca
	 */
	public Kromi(int ocupantes,String fechaI,int fila, int column, int aFabric, String marca) {
		super(ocupantes,fechaI,fila,column);
		Kromi.aFabricacion=aFabric;
		Kromi.marca=marca;
		
	}

	/**
	 * @return el aFabricacion
	 */
	public static int getaFabricacion() {
		return aFabricacion;
	}

	/**
	 * @param aFabricacion el aFabricacion a establecer
	 */
	public static void setaFabricacion(int aFabricacion) {
		Kromi.aFabricacion = aFabricacion;
	}

	/**
	 * @return el marca
	 */
	public static String getMarca() {
		return marca;
	}

	/**
	 * @param marca el marca a establecer
	 */
	public static void setMarca(String marca) {
		Kromi.marca = marca;
	}

}
