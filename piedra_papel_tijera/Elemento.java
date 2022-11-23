package piedra_papel_tijera;

public abstract class Elemento {
	//puede ser clase abstracta o interface
	
	
	public abstract int jugar(Tijera e);
	
	public abstract int jugar(Papel e);
	
	public abstract int jugar(Piedra e);

	public abstract int jugar(Elemento elemento2);//doy vuelta los jugadores

}
