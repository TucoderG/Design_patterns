package bancoStrategy;

import exceptions.SaldoInsuficienteException;

public interface Transferencia {	
	
	public void transferir(Cuenta origen, Cuenta destino, double monto) throws Exception, SaldoInsuficienteException;
	
	
}
