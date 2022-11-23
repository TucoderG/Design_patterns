package bancoStrategy;

import exceptions.SaldoInsuficienteException;

public class Main{

	public static void main(String[] args) {
		
		
		
		TransferenciaClass tc = new TransferenciaClass();
		
		Cuenta cc = new CuentaCorriente(100);
		Cuenta ca = new CajaAhorro(100);
		
		System.out.println(ca.getSaldo());
		// Caja de ahorro no puede pagar ya que no puede pagar ya que no le alcanza para la comision
		try {
			tc.transferir(cc, ca, 100);
			System.out.println("Se pudo cobrar.");
			
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
			System.out.println("No se pudo cobrar.");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se pudo cobrar.");
		}
		System.out.println(ca.getSaldo());
				
		cc = new CajaAhorro(cc.getSaldo());
		
		ca = new CuentaCorriente(ca.getSaldo());
			
		// Ahora la Caja Ahorro pasa a ser cuenta corriente y puede pagar sin comision y puede pedir 1 prestamo.
		try {
			tc.transferir(cc, ca, 150);
			System.out.println("Se pudo cobrar.");
			
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
			System.out.println("No se pudo cobrar.");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se pudo cobrar.");
		}
		System.out.println(ca.getSaldo());
		
	}


}
