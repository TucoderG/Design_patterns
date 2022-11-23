package bancoStrategy;

import exceptions.SaldoInsuficienteException;

public class TransferenciaClass implements Transferencia{

	@Override
	public void transferir(Cuenta origen, Cuenta destino, double monto) throws Exception, SaldoInsuficienteException {
		destino.validarSaldo(monto);
		destino.descontarSaldo(monto);
	}

}
