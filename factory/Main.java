package factory;

public class Main {

	public static void main(String[] args) {
		
		Persona hombre = PersonaFactory.getInstance().crearHombre(11222333, "Juan", "Calle falsa 123");
		Persona mujer = PersonaFactory.getInstance().crearMujer(44555666, "Martina", 23);
		
		System.out.println(hombre);
		System.out.println(mujer);
		
	}

}
