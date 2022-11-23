package contratos;

public class Validado implements EstadoContrato{
	
	private static Validado validado;
	
	private Validado(){
		
		
	}
	
	public static Validado getInstance() {
		
		if(validado == null) {
		
			
			validado = new Validado();
	
		}
		
		return validado;
	}

	@Override
	public String crear() throws Exception {
		throw new UnsupportedOperationException("El contrato ya fue creado, se esta validando.");
	}

	@Override
	public String editar() throws Exception {
		throw new UnsupportedOperationException("El contrato ya fue creado, se esta validando.");
	}

	@Override
	public String validar(String e) throws Exception {
		return "Contrato Validado.";
	}

	@Override
	public String aprobar() throws Exception {
		throw new UnsupportedOperationException("El contrato no puede aprobarse, se esta validando.");	
	}

	@Override
	public String finalizar() throws Exception {
		throw new UnsupportedOperationException("El contrato no puede finalizarse, se esta validando.");	
	}


}
