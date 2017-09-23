package app;

public class Palabra {
	private String palabra;

	public Palabra(String palabra) {
		this.palabra = palabra;
	}

	public String invertirPalabra() {
		String palabraInvertida="";
		
		for(int i=0; i<this.palabra.length(); i++) {
			int posicion= this.palabra.length()- i -1;
			palabraInvertida+= this.palabra.substring(posicion,posicion + 1);
		}
		
		return palabraInvertida;
	}
	
	
	public String getPalabra() {
		return palabra;
	}

}
