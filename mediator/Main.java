package mediator;


public class Main {

	public static void main(String[] args) {
		
		GrupoWhatsApp grupo = new GrupoWhatsApp();
		
		Personas personaA = new Profesor("Juan");
		Personas personaB = new Alumno("Joaquin");
		Personas personaC = new Alumno("Maximo");
		
		String mensaje;
		
		
		grupo.addPersona(personaA);
		grupo.addPersona(personaB);
		grupo.addPersona(personaC);
		
		mensaje = grupo.comunicarSucesos(grupo.getPersonas().get(0), "Hola gente!");
		
		mensaje += ("\n\n" + grupo.comunicarSucesos(grupo.getPersonas().get(2), "Hola, como estan?"));
		
		System.out.println(mensaje);
		
		
		
		

	}

}
