package decorator;

public class GaseosaGrande extends Decorator{

	public GaseosaGrande(Elemento elemento) {
		super(elemento);
	}

	@Override
	public double caluclarPrecio() {
		return super.calcularPrecio() + 150;
	}
	
	public String getDescripcion() {
		return super.getDescripcion() + ", Gaseosa grande";
	}
}
