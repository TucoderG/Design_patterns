package builder;

public class BuilderOld {
	
	private Objeto objeto;
	
	public BuilderOld() {
		objeto = new Objeto();
	}
	
	public void addActivo(boolean activo) {
		objeto.setActivo(activo);
	}
	
	public void addMarca(String marca) {
		objeto.setMarca(marca);
	}
	
	public void addTama�o(float tama�o) {
		objeto.setTama�o(tama�o);
	}
	
	public Objeto build() {
		return this.objeto;
	}
}
