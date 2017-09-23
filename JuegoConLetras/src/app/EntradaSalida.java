package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EntradaSalida {

	public Tablero leerArchivo() {
		String miPath = "rapigrama.in";
		Scanner sc;
		try {

			sc = new Scanner(new File(miPath));
			sc.useLocale(Locale.ENGLISH);
		
			int dimension =sc.nextInt();
			int cantPalabras=sc.nextInt();
			String[] cadenas = new String[dimension];
			Palabra[] palabras = new Palabra[cantPalabras];
			
			sc.nextLine();
			
			for(int i=0;i<dimension;i++){
				cadenas[i]= sc.nextLine();	
			}
			
			for(int i=0;i<cantPalabras;i++) {
				palabras[i]= new Palabra(sc.nextLine()); 
			}
			
			sc.close();
			
			return new Tablero(cadenas, palabras);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
	
	public void escribirArchivo(ArrayList<String> resultados){
		try {
			String miPath = "rapigrama.out";
		
			PrintWriter salida;
		
			salida = new PrintWriter(new FileWriter(miPath));
		
			int i;
		    for(String s : resultados){
		    	salida.println(s);
		    }
		     
			salida.close(); //esto escribe : dni: 50
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //  preparo el arch de salida
	}
}
