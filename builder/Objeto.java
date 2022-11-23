package builder;

public class Objeto {
	
	private float tamaño;
	private String marca;
	private boolean activo;
	

	
	public float getTamaño() {
		return tamaño;
	}
	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	public String toString() {
		return super.toString() + " - Marca: " + this.getMarca() + " - Tamaño: " + this.getTamaño() + " - Activo: " + this.isActivo();
	}
	

}
