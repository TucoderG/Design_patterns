package builder;

public class Objeto {
	
	private float tama�o;
	private String marca;
	private boolean activo;
	

	
	public float getTama�o() {
		return tama�o;
	}
	public void setTama�o(float tama�o) {
		this.tama�o = tama�o;
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
		return super.toString() + " - Marca: " + this.getMarca() + " - Tama�o: " + this.getTama�o() + " - Activo: " + this.isActivo();
	}
	

}
