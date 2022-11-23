package subastaObserver;

public class Ofertante_100 extends Ofertante{
	
	public Ofertante_100(String nombre, double dinero) {
		
		super(nombre, dinero);
	}
	

	@Override
	public void ofertar(Producto producto) {
		
		if(this.getDinero() >=  producto.getPrecio_actual() + 100 && producto.getPrecio_actual() < producto.getPrecio_final()) {
			this.setOferta(producto.getPrecio_actual() + 100);
		}
		else {
			this.setOferta(0);
		}
		
	}

	
}
