package factory;

public class Hombre extends Persona{

	private String direccion;
	

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
		return super.toString() + " - " + this.getDni() + " - " + this.getNombre() + " - " + this.direccion;
	}
}
