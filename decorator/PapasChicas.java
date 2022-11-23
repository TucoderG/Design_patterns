package decorator;

public class PapasChicas extends Decorator{

	public PapasChicas(Elemento elemento) {
		super(elemento);
	}

	@Override
	public double caluclarPrecio() {
		
		return super.calcularPrecio() + 50;
	}
	
	public String getDescripcion() {
		return super.getDescripcion() + ", Papas chicas";
	}
}
