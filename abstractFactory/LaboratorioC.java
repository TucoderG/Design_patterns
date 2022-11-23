package abstractFactory;

public class LaboratorioC implements LaboratorioAbstractFactory{

	@Override
	public SistemaOperativo crearSO() {
		
		Linux linux = new Linux();
		linux.setId(10);
		linux.setDistribucion("Debian");
		
		return linux;
	}

	@Override
	public Lenguaje crearLenguaje() {
		C c = new C();
		c.setVersion("8.1.1");
		c.setCantScripts(3);
		
		return c;
	}

}
