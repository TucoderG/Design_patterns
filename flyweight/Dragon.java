package flyweight;

public class Dragon {

	private Fly fly;
	private double velocidad;
	private int posicionX;
	private int posicionY;
	private int posicionZ;
	
	public Dragon() {
		this.fly = FlyFactory.getInstance().getFly("dragon");
	}
	
	public Dragon(int posX, int posY, int posZ, double velocidad) {
		this.fly = FlyFactory.getInstance().getFly("dragon");
		this.posicionX = posX;
		this.posicionY = posY;
		this.posicionZ = posZ;
		this.velocidad = velocidad;
		
	}

	
	public Fly getFly() {
		return fly;
	}
	public void setFly(Fly fly) {
		this.fly = fly;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public int getPosx() {
		return posicionX;
	}
	public void setPosx(int posx) {
		this.posicionX = posx;
	}
	public int getPosy() {
		return posicionY;
	}
	public void setPosy(int posy) {
		this.posicionY = posy;
	}
	public int getPosz() {
		return posicionZ;
	}
	public void setPosz(int posz) {
		this.posicionZ = posz;
	}
	
	
	
	public String toString() {
		return super.toString() + " Fly: " + this.fly + " Posicionx: " + this.posicionX + " Posiciony: " + this.posicionY + " Posicionz: " + this.posicionZ + " Velocidad: " + this.velocidad + "%";
	}

	
}
