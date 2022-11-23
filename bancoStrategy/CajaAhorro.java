package bancoStrategy;

import exceptions.SaldoInsuficienteException;


public class CajaAhorro extends Cuenta implements Commission{
	
	public CajaAhorro(double saldo) {
		
		this.saldo = saldo;
	}



	
	public void validarSaldo(double monto) throws SaldoInsuficienteException {
		if(this.getSaldo() <= 0) {
			throw new SaldoInsuficienteException("La cuenta no tiene saldo.");
		}
		else if((this.getSaldo() - monto) < 0) {
			throw new SaldoInsuficienteException("La cuenta no tiene saldo suficiente para pagar el monto.");
		}
		else if((this.getSaldo() - monto*1.01) < 0) {
			throw new SaldoInsuficienteException("La cuenta no tiene saldo suficiente para pagar con la comision.");
		}
	}

	
	public void sumarSaldo(double monto) {
		this.setSaldo(this.getSaldo() + monto);
	}
	public void descontarSaldo(double monto) throws SaldoInsuficienteException {
		this.setSaldo(this.getSaldo() - monto);
		this.cobrarCommission(monto*0.01);
	}

	@Override
	public void cobrarCommission(double monto) {
		this.setSaldo(this.getSaldo() - monto);
	}

	
	




	
	
	
}
