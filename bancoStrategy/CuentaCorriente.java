package bancoStrategy;

import exceptions.SaldoInsuficienteException;

public class CuentaCorriente extends Cuenta{
	
	private int cont = 0;
	
	public CuentaCorriente(double saldo) {
		this.saldo = saldo;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}




	public void validarSaldo(double monto) throws SaldoInsuficienteException {
		
		if(this.getSaldo() - monto < 0 && this.cont == 1) {
			
			throw new SaldoInsuficienteException("No tiene saldo ni descubierto.");
		}
		if(this.getSaldo() - monto < 0 && this.cont == 0) {
			this.descubierto();
			if(this.getSaldo() - monto < 0) {
				throw new SaldoInsuficienteException("A la cuenta no le alcanza para pagar.");
			}
		}
		if(this.getSaldo() <= 0) {   
			
			throw new SaldoInsuficienteException("No se puede pagar");
			
		}
		
		
	}


	public void sumarSaldo(double monto) {	
		this.setSaldo(this.getSaldo() + monto);
	}
	public void descontarSaldo(double monto) {
		this.setSaldo(this.getSaldo() - monto);
	}


	private void descubierto() {
		
		if(cont == 0) {
			this.setSaldo(this.getSaldo() + 1000);
			this.setCont(1);
		}
		
		
	}



	

}
