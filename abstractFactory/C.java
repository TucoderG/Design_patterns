package abstractFactory;

public class C extends Lenguaje{
	
	private int CantScripts;
	
	public C() {
		
	}

	public int getCantScripts() {
		return CantScripts;
	}

	public void setCantScripts(int cantScripts) {
		CantScripts = cantScripts;
	}

	public String toString() {
		return super.toString() + " " + this.getVersion() + " " + this.CantScripts;
	}
}
