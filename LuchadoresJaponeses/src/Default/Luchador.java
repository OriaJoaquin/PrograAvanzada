package Default;

public class Luchador  implements Comparable<Luchador> {
	private int peso;
	private int altura;
	
		
	public Luchador(int peso, int altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public int compareTo(Luchador o) {
		Luchador l = (Luchador) o;
		
		return (this.peso >= l.peso && this.altura >= l.altura)?1:0;
	}
}
