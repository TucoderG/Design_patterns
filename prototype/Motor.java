package prototype;

public class Motor implements Clonable{
	
	private String distribuidor;
	private int numeroMotor;
	
	public Motor() {
		
	}
	
	public Motor(String distribuidor, int numeroMotor) {
		this.distribuidor = distribuidor;
		this.numeroMotor = numeroMotor;
	}
	
	
	@Override
	public Object clonar() {
		Motor clon = new Motor();
		
		clon.setDistribuidor(this.getDistribuidor());
		clon.setNumeroMotor(this.getNumeroMotor());
		
		return clon;
	}
	
	
	
	
	public String getDistribuidor() {
		return distribuidor;
	}
	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}
	public int getNumeroMotor() {
		return numeroMotor;
	}
	public void setNumeroMotor(int numeroMotor) {
		this.numeroMotor = numeroMotor;
	}

	
	
	
	public String toString() {
		return super.toString() + " - Distribuidor: " + this.getDistribuidor() + " - Numero de Motor: " + this.getNumeroMotor(); 
	}



}
