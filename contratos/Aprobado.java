package contratos;

public class Aprobado implements EstadoContrato{
	
	private static Aprobado aprobado;
	
	private Aprobado(){
		
		
	}
	
	public static Aprobado getInstance() {
		
		if(aprobado == null) {
		
			
			aprobado = new Aprobado(); 
	
		}
		
		return aprobado;
	}

	@Override
	public String crear() throws Exception {
		throw new UnsupportedOperationException("El contrato ya fue creado, esta aprobandose.");
	}

	@Override
	public String editar() throws Exception {
		throw new UnsupportedOperationException("El contrato ya fue editado,esta aprobandose.");
	}

	@Override
	public String validar(String e) throws Exception {
		throw new UnsupportedOperationException("El contrato ya fue validado, esta aprobandose.");		
	}

	@Override
	public String aprobar() throws Exception {
		return "Contrato Aprobado.";
	}

	@Override
	public String finalizar() throws Exception {
		throw new UnsupportedOperationException("El contrato se esta aprobando, no se puede finalizar.");
	}


}
