package app;

public class Main {

	public static void main(String[] args) {
		
		EntradaSalida es = new EntradaSalida();
		
		Tablero tablero = es.leerArchivo();
		
		tablero.imprimirMat();
		
		es.escribirArchivo(tablero.resolver());
	}

}
