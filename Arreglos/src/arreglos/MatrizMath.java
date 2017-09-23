package arreglos;

public class MatrizMath {
	//private VectorMath[] mat;
	private VectorMath[] mat;
	
	public MatrizMath(int columnas, int filas) {
		this.mat = new VectorMath[columnas];
		
		for(int i=0;i<columnas;i++) {
			mat[i] = new VectorMath(filas);
		}
	}
	
	public int getFilas() {
		return mat[0].getCantidadElementos();
	}
	
	public int getCantidadColumnas() {
		return mat.length;
	}
	
	public VectorMath getColumna(int columna) {
		return this.mat[columna];
	}
}
