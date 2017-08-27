package Default;

public class Torneo {
	private int cantParticipantes;
	private Luchador[] luchadores;
	
	
	
	public Torneo(int cantParticipantes, Luchador[] luchadores) {
		super();
		this.cantParticipantes = cantParticipantes;
		this.luchadores = luchadores;
	}
	
	public int[] resolver(){
		int[] resultados = new int[this.cantParticipantes];
	    int i,j,cont;
		
	    for(i=0;i< this.cantParticipantes;i++){
	    	cont=0;
	    	for(j=0;j< this.cantParticipantes;j++){
				if(i!=j){
					cont+=this.luchadores[i].compareTo(luchadores[j]);
				}
			}
			resultados[i]=cont;
		}
		
	    return resultados;
	}
}
