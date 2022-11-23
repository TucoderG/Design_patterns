package contratos;

public interface EstadoContrato {
	
	public String crear() throws Exception;

	public String editar() throws Exception;
	
	public String validar(String e) throws Exception;

	public String aprobar() throws Exception;
	
	public String finalizar() throws Exception;

}
