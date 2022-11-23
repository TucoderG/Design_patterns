package flyweight;

public class FlyDragon implements Fly{
	
	private int daño;
	private int vidaBase;
	private int armadura;
	
	public FlyDragon() {
		this.daño = 10;
		this.vidaBase = 300;
		this.armadura = 50;
	}
	
	
	public int getDaño() {
		return daño;
	}
	public int getVidaBase() {
		return vidaBase;
	}
	public int getArmadura() {
		return armadura;
	}

	public String toString() {
		return super.toString() + " VidaBase: " + this.vidaBase + " Daño: " + this.daño + " Armadura: " + this.armadura;
	}
}
