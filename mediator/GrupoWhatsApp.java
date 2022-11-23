package mediator;

import java.util.ArrayList;
import java.util.List;

public class GrupoWhatsApp implements Mediator{
	
	private List<Personas> personas = new ArrayList<>();
	
	public GrupoWhatsApp() {
		
	}

	public List<Personas> getPersonas() {
		return personas;
	}

	public void addPersona(Personas persona) {
		this.personas.add(persona);
	}
	public void delPersona(Personas p) {
		this.personas.remove(p);
	}
	
	public String comunicarSucesos(Personas persona, String mensaje) {
		
		String suceso = persona.enviarMensaje(mensaje);
		
		for(int i = 0; i < this.personas.size(); i++) {
			
			if(this.personas.get(i) != persona) {
				
				suceso += ("\n" + this.personas.get(i).recibirMensaje());
				
			}
			
		}
		return suceso;
		
		
	}
	
	
	
	
}
