package flyweight;

public class Caballero {

	private Fly fly;
	private int posicionX;
	private int posicionY;
	
	
	public Caballero() {
		
	}
	
	public Caballero(int posicionx, int posiciony) {
		this.fly = FlyFactory.getInstance().getFly("caballero");
		this.posicionX = posicionx;
		this.posicionY = posiciony;
	}
	
	
	
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	public Fly getFly() {
		return fly;
	}
	public void setFly(Fly fly) {
		this.fly = fly;
	}
	
	
	public String toString() {
		return super.toString() + " posicionx: " + this.posicionX + " posiciony: " + this.posicionY + " " + this.fly;
	}

}
