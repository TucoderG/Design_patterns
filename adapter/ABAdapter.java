package adapter;

public class ABAdapter {
	
	private B b;

	
	public ABAdapter() {
		b = new B();
		
	}
	
	public String transformacion(Objeto objeto) {
		
		String nombre = objeto.getNombre();
		int edad = objeto.getEdad();
		
		return b.accion(nombre, edad);
	}
}
