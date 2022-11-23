package builder;

public class Builder {
	private Objeto objeto;
	
	public Builder() {
		objeto = new Objeto();
	}
	
	public Builder addActivo(boolean activo) {
		objeto.setActivo(activo);
		return this;
	}
	
	public Builder addMarca(String marca) {
		objeto.setMarca(marca);
		return this;
	}
	
	public Builder addTama�o(float tama�o) {
		objeto.setTama�o(tama�o);
		return this;
	}
	
	public Objeto build() {
		return this.objeto;
	}
}
