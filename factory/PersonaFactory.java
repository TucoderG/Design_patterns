package factory;

public class PersonaFactory {
	
	private static PersonaFactory personaFactory;

	private PersonaFactory() {
		
		
	}
	
	public static PersonaFactory getInstance() {
		if(personaFactory == null) {
			personaFactory = new PersonaFactory();
		}
		return personaFactory;
	}
	
	public Persona crearMujer(int dni, String nombre, int edad) {
		
		Mujer persona = new Mujer();
		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setEdad(edad);
		
		
		return persona;
		
	}
	
	public Persona crearHombre(int dni, String nombre, String direccion) {
		Hombre persona = new Hombre();
		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setDireccion(direccion);
		
		return persona;
	}
}
