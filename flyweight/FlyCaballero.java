package flyweight;

public class FlyCaballero implements Fly{
	
	private int da�o;
	private int vidaBase;
	private int armadura;
	
	public FlyCaballero() {
		this.da�o = 8;
		this.vidaBase = 200;
		this.armadura = 30;
	}
	
	
	public int getDa�o() {
		return da�o;
	}
	public int getVidaBase() {
		return vidaBase;
	}
	public int getArmadura() {
		return armadura;
	}

	public String toString() {
		return super.toString() + " VidaBase: " + this.vidaBase + " Da�o: " + this.da�o + " Armadura: " + this.armadura;
	}
}
