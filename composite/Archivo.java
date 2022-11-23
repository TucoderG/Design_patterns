package composite;

public class Archivo implements Componente{

	private String nombre;
	
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String abrir() {
		
		return "Archivo abierto.";
	}

	@Override
	public String borrar() {
		
		return "Archivo borrado.";
	}

	@Override
	public String cambiarNombre(String nombre) {
		this.setNombre(nombre);
		return "Nombre cambiado.";
	}

	@Override
	public void addComponente(Componente componente) {
		throw new UnsupportedOperationException("Estas sobre un archivo.");
		
	}

	@Override
	public void removeComponente(Componente componente) {
		throw new UnsupportedOperationException("Estas sobre un archivo.");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return super.toString() + " " + this.getNombre();
	}

}
