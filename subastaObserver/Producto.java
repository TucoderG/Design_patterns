package subastaObserver;

public class Producto {
	
	private String description;
	private double precio_actual;
	private double precio_final;
	
	public Producto() {
		
		
	}
	
	public Producto(String desc, double precioActual, double precioFinal) {
		
		this.description = desc;
		this.precio_actual = precioActual;
		this.precio_final = precioFinal;
		
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	public double getPrecio_actual() {
		return precio_actual;
	}
	public void setPrecio_actual(double precio_actual) {
		this.precio_actual = precio_actual;
	}

	
	public double getPrecio_final() {
		return this.precio_final;
	}
	public void setPrecio_final(double precio_final) {
		this.precio_final = precio_final;
	}
}
