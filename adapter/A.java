package adapter;

public class A {
	
	private ABAdapter abadapter;
	
	public A() {
		abadapter = new ABAdapter();
	}
	
	
	public String funcion(Objeto objeto) {
		
		return abadapter.transformacion(objeto);
		
	}

	
	
	public ABAdapter getAbadapter() {
		return abadapter;
	}
	public void setAbadapter(ABAdapter abadapter) {
		this.abadapter = abadapter;
	}

}
