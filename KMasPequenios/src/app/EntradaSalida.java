package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;


public class EntradaSalida {
	public KMasPequenios leerArchivo() {
		String miPath = "numeros.in";
		Scanner sc;
		try {

			sc = new Scanner(new File(miPath));
			sc.useLocale(Locale.ENGLISH);
								
			int n = sc.nextInt();
			int k= sc.nextInt();
			
			int[] numeros = new int[n];
			
			for(int i=0;i<n;i++){
				numeros[i] = sc.nextInt();
				//System.out.println(numeros[i]);
			}
			
			
			sc.close();
			
			return new KMasPequenios(n,k,numeros);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
	
	public void escribirArchivo(int[] resultado, int kEncontrados){
		try {
			String miPath = "pequenios.out";
		
			PrintWriter salida;
		
			salida = new PrintWriter(new FileWriter(miPath));
		
			salida.println(kEncontrados);
		    for(int i=0;i<kEncontrados;i++){
		    	salida.println(resultado[i]);
		    }
		     
			salida.close(); //esto escribe : dni: 50
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //  preparo el arch de salida
	}
	
	public void escribirMensaje(String mensaje){
		try {
			String miPath = "pequenios.out";
		
			PrintWriter salida;
		
			salida = new PrintWriter(new FileWriter(miPath));
		
			salida.println("mensaje:" + mensaje);

			salida.close(); //esto escribe : dni: 50
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //  preparo el arch de salida
	}
}
