package decorator;

public class Main {

	public static void main(String[] args) {
		
		Elemento elemento = new PapasChicas(new GaseosaGrande(new HamburguesaPollo()));
		
		Elemento elemento2 = new PapasGrandes(new GaseosaChica( new Hamburguesa()));
		
		System.out.println(elemento.getDescripcion());
		System.out.println(elemento.caluclarPrecio());
		System.out.println("");
		
		System.out.println(elemento2.getDescripcion());
		System.out.println(elemento2.caluclarPrecio());

	}

}
