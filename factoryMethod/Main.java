package factoryMethod;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Hombre();
		persona.crear(11222333, "Elias");
		
		System.out.println(persona);
	}

}
