package piedra_papel_tijera;

public class Main {

	public static void main(String[] args) {
		Elemento elemento1 = new Piedra();
		
		Elemento elemento2 = new Tijera();
		
		switch(-1 * elemento1.jugar(elemento2)) { // como tengo que cambiar el jugador para utilizar la clase generica
												  // pongo -1 * para que intercambie de lugar nuevamente
		
			case 1: System.out.println("Gano el jugador 1");
				break;
				
			case 0: System.out.println("Empate");
				break;
				
			case -1: System.out.println("Gano el jugador 2");
				break;
				
			
		}

	}

}
