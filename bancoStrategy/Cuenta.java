package bancoStrategy;


public class Cuenta{

	protected double saldo;
	
	public Cuenta() {
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double monto) {
		this.saldo = monto;
	}


	
	public void validarSaldo(double monto) throws Exception{
		throw new Exception("Tipo de cuenta invalida.");
	}
	public void sumarSaldo(double monto) throws Exception{
		throw new Exception("Tipo de cuenta invalida.");
	}
	public void descontarSaldo(double monto) throws Exception{
		throw new Exception("Tipo de cuenta invalida.");
	}
	
	
	

}
