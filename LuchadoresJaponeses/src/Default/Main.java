package Default;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntradaSalida es = new EntradaSalida();
		
		Torneo t = es.leerArchivo();
		
		System.out.println("//////////");
		es.escribirArchivo(t.resolver());
		
			
	}

}
