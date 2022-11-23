package contratos;


public class Creado implements EstadoContrato{
	
	private static Creado creado;
	
	private Creado(){
		
		
	}
	
	public static Creado getInstance() {
		
		
		if(creado == null) {
		
			
			creado = new Creado(); 
			
		}
		
		return creado;
	}
	
	@Override
	public String crear() throws Exception {
		
		return "Contrato creado.";
	}

	@Override
	public String editar() throws Exception {
		throw new UnsupportedOperationException("El contrato no se puede editar, se esta creando.");
		
	}

	@Override
	public String validar(String e) throws Exception {
		throw new UnsupportedOperationException("El contrato no se puede validar, se esta creando.");		
	}

	@Override
	public String aprobar() throws Exception {
		throw new UnsupportedOperationException("El contrato no se puede aprobar, se esta creando.");
		
	}

	@Override
	public String finalizar() throws Exception {
		throw new UnsupportedOperationException("El contrato no se puede finalizar, se esta creando.");
		
	}


}
