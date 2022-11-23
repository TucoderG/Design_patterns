package prototype;

public class Auto implements Clonable{

	private String marca;
	private int potencia;
	private Motor motor;
	
	public Auto() {
		
	}
	public Auto(String marca, int potencia, Motor motor) {
		this.marca = marca;
		this.potencia = potencia;
		this.motor = motor;
		
	}
	
	public Object clonar() {
		Auto clon = new Auto();
		
		clon.setMarca(this.getMarca());
		clon.setPotencia(this.getPotencia());
		clon.setMotor( (Motor)(this.motor.clonar()) );
		
		
		return clon;
	}

	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String nombre) {
		this.marca = nombre;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	public String toString() {
		return super.toString() + " - Marca: " + this.getMarca() + " - Potencia: " + this.getPotencia() + "\n" + this.getMotor();
 	}

}
