package contratos;

public class Editado implements EstadoContrato{
	
	private static Editado editado;
	
	private Editado(){
		
		
	}
	
	public static Editado getInstance() {
		
		if(editado == null) {
		
			
			editado = new Editado(); 
	
		}
		
		return editado;
	}
	
	@Override
	public String crear() throws Exception {
		throw new UnsupportedOperationException("El contrato ya fue creado, se esta editando.");
	}

	@Override
	public String editar() throws Exception {
		return "Contrato editado.";	
	}

	@Override
	public String validar(String e) throws Exception {
		throw new UnsupportedOperationException("El contrato no puede validarse, se esta editando.");		
	}

	@Override
	public String aprobar() throws Exception {
		throw new UnsupportedOperationException("El contrato no puede aprobarse todavia, se esta editando.");
	}

	@Override
	public String finalizar() throws Exception {
		throw new UnsupportedOperationException("El contrato no puede finalizar todavia, se esta editando.");
	}

}
