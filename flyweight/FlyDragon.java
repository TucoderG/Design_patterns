package flyweight;

public class FlyDragon implements Fly{
	
	private int da�o;
	private int vidaBase;
	private int armadura;
	
	public FlyDragon() {
		this.da�o = 10;
		this.vidaBase = 300;
		this.armadura = 50;
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
