package abstractFactory;

public class Java extends Lenguaje{
	private boolean BDEmbebida;
	
	public Java() {
		
	}

	public boolean isBDEmbebida() {
		return BDEmbebida;
	}

	public void setBDEmbebida(boolean bDEmbebida) {
		BDEmbebida = bDEmbebida;
	}
	
	public String toString() {
		return super.toString() + " " + this.getVersion() + " " + this.BDEmbebida;
	}

}
