package factoryMethod;

public class Hombre extends Persona{
	
	private int edad;
	
	public Hombre() {
		
	}
	
	
	@Override
	public void agregarOtros() {
		setEdad(20);
	}

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
