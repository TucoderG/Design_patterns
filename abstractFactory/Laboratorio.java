package abstractFactory;

public class Laboratorio {
	
	private SistemaOperativo so;
	private Lenguaje lenguaje;
	
	
	public Laboratorio(LaboratorioAbstractFactory laf) {
		
		this.setSo(laf.crearSO());
		this.setLenguaje(laf.crearLenguaje());
	}
	
	
	public SistemaOperativo getSo() {
		return so;
	}
	public void setSo(SistemaOperativo so) {
		this.so = so;
	}
	public Lenguaje getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(Lenguaje lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	public String toString() {
		return super.toString() + " - " + this.so + " - " + this.lenguaje;
	}
	

}
