package prototype;

public class Persona implements Clonable{

	private String nombre;
	private String Apellido;
	private Auto auto;
	
	public Persona() {
		
		
	}
	public Persona(String nombre, String apellido, Auto auto) {
		this.nombre = nombre;
		this.Apellido = apellido;
		this.auto = auto;
	}
	
	@Override
	public Object clonar() {
		Persona clon = new Persona();
		
		clon.setNombre( this.getNombre() );
		clon.setApellido(this.getApellido());
		clon.setAuto( (Auto)(auto.clonar()) );
		
		return clon;
	}

	
	
	public Auto getAuto() {
		return this.auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	
	
	public String toString() {
		return super.toString() + " - " + this.getNombre() + ", " + this.getApellido()  + "\n" + this.getAuto();
	}
	
	
	

}
