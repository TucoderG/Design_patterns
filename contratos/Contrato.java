package contratos;


public class Contrato{
	
	private EstadoContrato estadoContrato;
	private String mensaje;
	
	public Contrato() {
		this.estadoContrato = Creado.getInstance();
	}

	public String crear() throws Exception {
		 mensaje = estadoContrato.crear();
		this.estadoContrato = Editado.getInstance();
		return mensaje;
	}
	
	public String editar() throws Exception {
		mensaje = estadoContrato.editar();
		this.estadoContrato = Validado.getInstance();
		return mensaje;
	}
	
	public String validar(String nuevoEstado) throws Exception {
		mensaje = estadoContrato.validar(nuevoEstado);
		if(nuevoEstado.equals("a")) {
			this.estadoContrato = Aprobado.getInstance();
		}else {
			this.estadoContrato = Editado.getInstance();
		}
		return mensaje;
	}
	
	public String aprobar() throws Exception {
		mensaje = estadoContrato.aprobar();
		this.estadoContrato = Finalizado.getInstance();
		return mensaje;
	}
	
	public String finalizar() throws Exception {
		return estadoContrato.finalizar();
	}

	
	
	
	public EstadoContrato getEstadoContrato() {
		return estadoContrato;
	}
	public void setEstadoContrato(EstadoContrato estadoContrato) {
		this.estadoContrato = estadoContrato;
	}


	
}
