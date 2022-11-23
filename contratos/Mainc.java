package contratos;




public class Mainc {

	public static void main(String[] args){
		
		// CREAR
		Contrato contrato = new Contrato();
		
		try {
			System.out.println(contrato.crear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// EDITAR
		try {
			System.out.println(contrato.editar());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// VALIDAR
		try {
			System.out.println(contrato.validar("e"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// EDITAR NUEVAMENTE
		try {
			System.out.println(contrato.editar());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// INTENTO FINALIZAR
		try {
			System.out.println(contrato.finalizar());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// VALIDAR
		try {
			System.out.println(contrato.validar("a"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// APROBAR
		try {
			System.out.println(contrato.aprobar());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// EDITAR	
		try {
			System.out.println(contrato.editar());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// FINALIZAR
		try {
			System.out.println(contrato.finalizar());
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
