package decorator;

public class HamburguesaPollo implements Elemento{

	@Override
	public double caluclarPrecio() {
		
		return 700;
	}
	
	public String getDescripcion() {
		return "Hamburguesa de Pollo";
	}

}
