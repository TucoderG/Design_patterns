package factory;

public class Mujer extends Persona{
	
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return super.toString() + " - " + this.getDni() + " - " + this.getNombre() + " - " + this.edad;
	}
}
