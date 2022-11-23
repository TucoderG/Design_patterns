package contratos;

public class Finalizado implements EstadoContrato{
	
	private static Finalizado finalizado;
	
	private Finalizado(){
		
		
	}
	
	public static Finalizado getInstance() {
		
		if(finalizado == null) {
		
			
			finalizado = new Finalizado(); 
	
		}
		
		return finalizado;
	}

	@Override
	public String crear() throws Exception {
		throw new UnsupportedOperationException("El contrato ya fue creado, esta finalizandose.");
	}

	@Override
	public String editar() throws Exception {
		throw new UnsupportedOperationException("El contrato ya fue editado, esta finalizandose.");
	}

	@Override
	public String validar(String e) throws Exception {
		throw new UnsupportedOperationException("El contrato ya fue validado, esta finalizandose.");		
	}

	@Override
	public String aprobar() throws Exception {
		throw new UnsupportedOperationException("El contrato ya fue aprobado, esta finalizandose.");
	}

	@Override
	public String finalizar() throws Exception {
		return "Contrato Finalizado.";
	}

	
}
