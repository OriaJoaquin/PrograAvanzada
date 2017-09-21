package app;

public class Main {

	public static void main(String[] args) {
		EntradaSalida es = new EntradaSalida();
		try {
	
			KMasPequenios k = es.leerArchivo();

			int[] resultado;

			resultado = k.devolverKMasPequenios();

			es.escribirArchivo(resultado, k.getkEncontrados());
		} catch (Exception e) {
			es.escribirMensaje(e.getMessage());
		}

	}

}
