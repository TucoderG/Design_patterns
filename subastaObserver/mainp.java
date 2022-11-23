package subastaObserver;

public class mainp {

	public static void main(String[] args) {
		
		
		Ofertante a = new Ofertante_100("Juan", 1600);
		Ofertante b = new Ofertante_2("Alex", 1200);
		Ofertante c = new Ofertante_100("Elias", 1600);
		Ofertante d = new Ofertante_2("Alegria", 2000);
		
		a = new Ofertante_2(a.getNombre(), a.getDinero());
		b = new Ofertante_100(b.getNombre(), b.getDinero());
		c = new Ofertante_2(c.getNombre(), c.getDinero());
		d = new Ofertante_100(d.getNombre(), d.getDinero());
		
		
		Subastador o = new Subastador("Cuadro", 50, 1200);
		
		o.addObs(a);
		o.addObs(b);
		o.addObs(c);
		o.addObs(d);
		
		o.subastar();
		
		System.out.println("El ganador de la subasta es: " + o.getGanador().getNombre() + " compro un " + o.getProducto().getDescription() + " por: $" + o.getProducto().getPrecio_actual());
		
		
		
		
		

	}

}
