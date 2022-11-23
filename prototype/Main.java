package prototype;

public class Main {

	public static void main(String[] args) {
		
		Motor motor = new Motor("Ciclo Otto", 12004289);
		Auto auto = new Auto("Ford", 180, motor);
		
		Persona persona = new Persona("Anibal", "Fernandez", auto);
		
		System.out.println(persona);
		
		Persona entidadB = (Persona)(persona.clonar());
		System.out.println("\n" + entidadB);
	}

}
