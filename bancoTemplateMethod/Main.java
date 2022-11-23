package bancoTemplateMethod;

import exceptions.SaldoInsuficienteException;


public class Main{

	public static void main(String[] args) {
		
		Cuenta cc = new CuentaCorriente(100);
		Cuenta ca = new CajaAhorro(101);
		
		System.out.println(cc.getSaldo());
		try {
			ca.transferir(cc, 110);
			System.out.println("Se pudo cobrar.");
			
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
			
		
		cc = new CajaAhorro(cc.getSaldo());
		
		ca = new CuentaCorriente(ca.getSaldo());
				
		System.out.println(cc.getSaldo());
		try {
			ca.transferir(cc, 980);
			System.out.println("Se pudo cobrar.");
			
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println(cc.getSaldo());	
		
		
		
		
	}


}
