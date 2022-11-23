package abstractFactory;

public class Linux extends SistemaOperativo{
	
	private String distribucion;
	
	public Linux() {
		
	}
	

	public String getDistribucion() {
		return distribucion;
	}

	public void setDistribucion(String distribucion) {
		this.distribucion = distribucion;
	}

	public String toString() {
		return super.toString() + " " + this.getId() + " " + this.distribucion;
	}
}
