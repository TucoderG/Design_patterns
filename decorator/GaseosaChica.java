package decorator;

public class GaseosaChica extends Decorator{

	public GaseosaChica(Elemento elemento) {
		super(elemento);
		
	}

	@Override
	public double caluclarPrecio() {
		
		return super.calcularPrecio() + 50;
	}

	public String getDescripcion() {
		return super.getDescripcion() + ", Gaseosa chica";
	}
}
