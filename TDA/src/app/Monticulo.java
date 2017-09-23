package app;

public class Monticulo {
	int[] vector;
	int tope;
	
	public Monticulo(int tam) throws Exception {
		if (tam<0)
			throw new Exception("Tamaño tiene que ser mayor a cero.");
		this.vector = new int[tam+1];
		this.tope =0;
	}
	
	public int agregarAMonticulo(int valor) {
		if(this.tope==0) {
			this.tope++;
			this.vector[this.tope]=valor;
		} else {	
			if(this.tope == this.vector.length -1)
				return 0;
			
			this.tope++;
			
			int p=this.tope;
			this.vector[p]= valor;
			
			int padre = p /2;
			
			while((this.vector[padre]<valor) && padre>0) {
				intercambiar(padre,p);
				p=padre;
				padre = p /2;
			}
		}
		return 1;
	}
	
	public int sacarDeMonticulo() {
		if(this.tope==0) {
			return 0;
		}
		
		int aux = this.vector[1];
		this.vector[1]=this.vector[this.tope];
		//this.vector[this.tope]=aux;
		
		if(this.tope==0){
			return 0;
		}
		this.tope--;
		int p=1;
		int hi=2;
		int hd=3;
		
		/*
		  10
		 6  7
		 
		  
		   12   --> 16
		 8   9
		7 1 2 
		 
		 
		 */
		
		while(hi<=this.tope && hd<=this.tope) {
			//if(this.vector[hi]<this)
			if(this.vector[hi]>this.vector[p]){
				intercambiar(hi,p);
				p=hi;
			}else if(this.vector[hd] >this.vector[p]){
					intercambiar(hd,p);
					p=hd;
			}
			hi=p*2;
			hd=p*2+1;
		}
		return aux;
	}
	
	private void intercambiar(int a, int b) {
		int aux = this.vector[a];
		this.vector[a]= this.vector[b];
		this.vector[b]= aux;
	}
	
	public void mostrar() {
		for(int i=1;i<=this.tope;i++) {
			System.out.println(this.vector[i]);
		}
	}
}
