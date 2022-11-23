package factoryMethod;

public abstract class Persona {
	
	private int dni;
	private String nombre;
	
	public Persona() {
		
	}
	public final void crear(int dni, String nombre) {
		setDni(dni);
		setNombre(nombre);
		agregarOtros();
	}
	
	public abstract void agregarOtros();
	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
