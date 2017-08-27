package Default;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class EntradaSalida {

	public Torneo leerArchivo() {
		String miPath = "Sumo.in";
		Scanner sc;
		try {

			sc = new Scanner(new File(miPath));
			sc.useLocale(Locale.ENGLISH);
		
			int cantParticipantes =sc.nextInt();
			int i;
			Luchador[] luchadores= new Luchador[cantParticipantes];
			
			for(i=0;i<cantParticipantes;i++){

				luchadores[i] = new Luchador(sc.nextInt(),sc.nextInt());
				
				System.out.println(luchadores[i].getPeso() + "  " + luchadores[i].getAltura());
			}
			
			
			sc.close();
			
			return new Torneo(cantParticipantes, luchadores);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
	
	public void escribirArchivo(int[] resultados){
		try {
			String miPath = "salida.out";
		
			PrintWriter salida;
		
			salida = new PrintWriter(new FileWriter(miPath));
		
			int i;
		    for(i=0;i<resultados.length;i++){
		    	salida.println(resultados[i]);
		    }
		     
			salida.close(); //esto escribe : dni: 50
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //  preparo el arch de salida
	}
}
