package abstractFactory;

public class LaboratorioJava implements LaboratorioAbstractFactory{

	@Override
	public SistemaOperativo crearSO() {
		Windows windows = new Windows();
		windows.setId(155);
		windows.setVersion("10.5.2");
		
		return windows;
	}

	@Override
	public Lenguaje crearLenguaje() {
		Java java = new Java();
		java.setVersion("15.0.11");
		java.setBDEmbebida(true);
		
		return java;
	}

}
