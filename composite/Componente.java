package composite;

public interface Componente {
	
	public String abrir();
	public String borrar();
	public String cambiarNombre(String nombre);
	public void addComponente(Componente componente);
	public void removeComponente(Componente componente);

}
