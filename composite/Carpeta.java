package composite;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Componente{
	
	private List<Componente> componentes = new ArrayList<>();
	private String nombre;
	
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void addComponente(Componente componente) {
		componentes.add(componente);
	}
	@Override
	public void removeComponente(Componente componente) {
		componentes.remove(componente);
	}

	
	@Override
	public String abrir() {
		return "Carpeta abierta!";
	}
	
	@Override
	public String borrar() {
		if(this.componentes.isEmpty()) {
			return "Carpeta borrada.";
		}
		else {
			return "Esta carpeta no esta vacia y no se puede borrar.";
		}
	}
	
	@Override
	public String cambiarNombre(String nombre) {
		this.setNombre(nombre);
		return "Nombre cambiado";
	}
	
	
	public List<Componente> getComponentes(){
		return this.componentes;
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
