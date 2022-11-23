package decorator;

public class PapasGrandes extends Decorator{

	public PapasGrandes(Elemento elemento) {
		super(elemento);
	}

	@Override
	public double caluclarPrecio() {
		
		return super.calcularPrecio() + 75;
	}

	public String getDescripcion() {
		return super.getDescripcion() + ", Papas Grandes";
	}
}
