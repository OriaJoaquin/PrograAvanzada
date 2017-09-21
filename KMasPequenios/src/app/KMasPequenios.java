package app;

import java.util.Arrays;

public class KMasPequenios {
	private int n;
	private int k;
	private int[] numeros;
	private int kEncontrados;
	
	public KMasPequenios(int n, int k, int[] numeros) {
		this.n =n;
		this.k = k;
		this.numeros = numeros;
		this.kEncontrados=0;
	}
	
	
	public int getkEncontrados() {
		return kEncontrados;
	}


	public int[] devolverKMasPequenios() throws Exception {
		int[] resultado = new int[this.k];
		int j=0, i=0;
		
		if(this.k>this.n) {
			throw new Exception("N debe de ser mayor a k");
		}
		
		Arrays.sort(this.numeros);
		
		while(i<this.k && j <this.numeros.length) {
			resultado[i]=this.numeros[j];
			j++;
			i++;
			this.kEncontrados++;
			while(j<this.numeros.length && this.numeros[j-1]==this.numeros[j])
				j++;
		}
		
		
		return resultado;
		
	}
}
