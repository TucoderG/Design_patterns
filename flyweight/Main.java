package flyweight;

public class Main {

	public static void main(String[] args) {
		
		Dragon dragon = new Dragon(1, 1, 10, 1.5);
		Dragon dragon2 = new Dragon(3, 3, 10, 1.3);
		
		Caballero caballero = new Caballero(2, 2);
		Caballero caballero2 = new Caballero(4, 4);
		
		System.out.println(dragon);
		System.out.println(dragon2);
		System.out.println(caballero);
		System.out.println(caballero2);
		

	}

}
