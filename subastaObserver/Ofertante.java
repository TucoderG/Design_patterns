package subastaObserver;


public abstract class Ofertante{
	
	private String nombre;
	private double oferta;
	private double dinero;
	
	public Ofertante(String nombre, double dinero) {
		
		this.nombre = nombre;
		this.oferta = 0;
		this.dinero = dinero;
		
	}
	
	public abstract void ofertar(Producto producto);
	
	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public double getOferta() {
		return oferta;
	}

	public void setOferta(double oferta) {
		this.oferta = oferta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
