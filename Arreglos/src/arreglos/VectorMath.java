package arreglos;

public class VectorMath {
	private double[] vec;
	
	public VectorMath(int columnas) {
		this.vec= new double[columnas];
	}
	//Ver apunte de normas en descargas.
	
	public double multiplicarPor(VectorMath v) throws Exception {
		if(this.getCantidadElementos() !=v.getCantidadElementos())
			throw new Exception("Los vectores no tienen la misma cantidad de elementos");
		
		double resultado=0;
		for(int i=0;i<v.getCantidadElementos();i++) {
			resultado+=(this.vec[i]*v.vec[i]);
		}
		
		return resultado;
	}
	
	public VectorMath multiplicarPor(MatrizMath m) throws Exception {
		if(this.getCantidadElementos()!=m.getFilas())
			throw new Exception("La cantidad de elementos de elementos no coincide con la cantidad de filas de la matriz");
		
		VectorMath resultado = new VectorMath(m.getCantidadColumnas());
		
		for(int i=0;i<this.getCantidadElementos();i++) {
			resultado.vec[i] = this.multiplicarPor(m.getColumna(i));
		}

		return resultado;
	}
	
	public int getCantidadElementos() {
		return this.vec.length;
	}
}
