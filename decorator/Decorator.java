package decorator;

public abstract class Decorator implements Elemento{
	
	protected Elemento elemento;
	
	public Decorator(Elemento elemento) {
		this.elemento = elemento;
	}
	
	public double calcularPrecio() {
		
		return elemento.caluclarPrecio();
		
	}
	
	public String getDescripcion() {
		
		return elemento.getDescripcion();
	}

}
