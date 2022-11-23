package bancoTemplateMethod;

import exceptions.SaldoInsuficienteException;

public abstract class Cuenta{

	protected double saldo;
	
	public Cuenta() {
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double monto) {
		this.saldo = monto;
	}

	public final void transferir(Cuenta destino, double monto) throws SaldoInsuficienteException {
		
		destino.validarSaldo(monto);
		destino.descontarSaldo(monto);
		this.sumarSaldo(monto);

		
	}
	
	public abstract void validarSaldo(double monto) throws SaldoInsuficienteException;
	
	public abstract void sumarSaldo(double monto) throws SaldoInsuficienteException;
	
	public abstract void descontarSaldo(double monto) throws SaldoInsuficienteException;
	
	
	

}
