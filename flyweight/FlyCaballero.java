package flyweight;

public class FlyCaballero implements Fly{
	
	private int daño;
	private int vidaBase;
	private int armadura;
	
	public FlyCaballero() {
		this.daño = 8;
		this.vidaBase = 200;
		this.armadura = 30;
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
