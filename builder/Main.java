package builder;



public class Main {
	
	public static void main(String[] args) {
	
		Objeto objeto = new Objeto();
		objeto.setActivo(true);
		objeto.setMarca("pp");
		objeto.setTamaño(10f);
		
		
		BuilderOld builderOld = new BuilderOld();
		builderOld.addActivo(true);
		builderOld.addMarca("pp");
		builderOld.addTamaño(10f);
		Objeto buildOld = builderOld.build();
		System.out.println(buildOld);
		
		
		
		Objeto objeto2 = new Builder().addActivo(true).addMarca("pp").addTamaño(10f).build();
		System.out.println(objeto2);
		
	}
}
