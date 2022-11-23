package decorator;

public class Hamburguesa implements Elemento{

	@Override
	public double caluclarPrecio() {
		
		return 600;
	}
	
	public String getDescripcion() {
		return "Hamburguesa simple";
	}
}
