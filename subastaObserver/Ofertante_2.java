package subastaObserver;

public class Ofertante_2 extends Ofertante{
	
	public Ofertante_2(String nombre, double dinero) {
		
		super(nombre, dinero);
	}
	
	@Override
	public void ofertar(Producto producto) {
		
		if(this.getDinero() >= producto.getPrecio_actual() * 2 && producto.getPrecio_actual() < producto.getPrecio_final()) {
			this.setOferta(producto.getPrecio_actual() * 2);
			
			
		}
		else {
			this.setOferta(0);
		}
	}
	

}
