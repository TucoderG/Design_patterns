package mediator;

public class Alumno implements Personas{
	
	private String nombre;
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String enviarMensaje(String mensaje) {
		return "Soy " + this.nombre + " y envi? el mensaje: '" + mensaje + "'.";
	}
	public String recibirMensaje() {
		return "Soy " + this.nombre + " y recib? el mensaje.";
	}

}
