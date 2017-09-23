package app;

import java.util.ArrayList;

public class Tablero {
	private String[] vecHorizontal;
	private String[] vecVertical;
	private Palabra[] palabras;
	
	public Tablero(String[] matHorizontal, Palabra[] palabras) {
		this.vecHorizontal = matHorizontal;
		this.palabras = palabras;
		llenarVectorVertical();
	}
	
	public ArrayList<String> resolver() {
		
		ArrayList<String> lista= new ArrayList<String>();
		for(int i=0;i<palabras.length;i++) {
			String resultado = buscarPalabra(palabras[i]);
			if(!resultado.isEmpty())
				lista.add(String.format("%d ", i+1) + resultado); 
		}
		
		return lista;
	}
	
	public String buscarPalabra(Palabra palabra) {
		for(int i=0;i<this.vecHorizontal.length;i++) {
			if(this.vecHorizontal[i].contains(palabra.getPalabra()))
				return "E";
		}
		
		for(int i=0;i<this.vecHorizontal.length;i++) {
			if(this.vecHorizontal[i].contains(palabra.invertirPalabra()))
				return "O";
		}
		
		for(int i=0;i<this.vecVertical.length;i++) {
			if(this.vecVertical[i].contains(palabra.getPalabra()))
				return "S";
		}
		
		for(int i=0;i<this.vecVertical.length;i++) {
			if(this.vecVertical[i].contains(palabra.invertirPalabra()))
				return "N";
		}
		
		return "";
	}
	
	private void llenarVectorVertical() {
		this.vecVertical = new String[this.vecHorizontal.length];
		
		for(int i=0; i< this.vecHorizontal.length;i++){
			this.vecVertical[i]="";
			for(int j=0; j<this.vecHorizontal.length;j++) {
				this.vecVertical[i]+= this.vecHorizontal[j].substring(i, i+1);
			}
		}
	}
	
	public void imprimirMat(){
		for(int i=0;i<this.vecHorizontal.length;i++) {
			System.out.println(this.vecHorizontal[i]);
		}
		
		System.out.println("///////////////////////////");
		
		for(int i=0;i<this.vecHorizontal.length;i++) {
			System.out.println(this.vecVertical[i]);
		}
	}
	
}
