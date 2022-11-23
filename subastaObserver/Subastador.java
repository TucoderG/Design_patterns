package subastaObserver;

import java.util.ArrayList;

public class Subastador extends Subastas {
	
	private Producto producto;
	private ArrayList<Ofertante> obs = new ArrayList<>();
	
	private static Ofertante ganador;
	private double aux;
	private double maxOferta;
	private int posicion;
	
	public Subastador() {

	}
	
	public Subastador(String desc, double precioActual, double precioFinal) {
		this.producto = new Producto(desc, precioActual, precioFinal);
	}
	
	
	private void setGanador(Ofertante ofertanteganador) {
		ganador = ofertanteganador;
	}
	public Ofertante getGanador() {
		return ganador;
	}

	
	public double getMaxOferta() {
		return this.maxOferta;
	}
	public void setMaxOferta(double maxOferta) {
		this.maxOferta = maxOferta;
	}


	public int getPosicion() {
		return this.posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	
	public void setProducto(Producto p) {
		this.producto = p;
	}
	public Producto getProducto() {
		return this.producto;
	}
	
	
	public double getAux() {
		return this.aux;
	}
	public void setAux(double aux) {
		this.aux = aux;
	}

	
	public ArrayList<Ofertante> getObs() {
		return this.obs;
	}
	public void addObs(Ofertante obs) {
		this.obs.add(obs);
	}
	public void dellObs(Ofertante obs) {
		this.obs.remove(obs);
	}
	
	
	public void ComunicarAll() {
		
		for(int i = 0; i < this.obs.size(); i++){
			 
			this.getObs().get(i).ofertar(this.getProducto());
			
		}
		
		
	}
	
	private int subasta() {
		
		if(this.getObs().size() == 1) { //Queda solo un ofertante y se corta el ciclo.
			return 0;
		}
		for(int j = 0; j < this.obs.size(); j++){ // Recorro el array de ofertantes
			
			if(this.obs.get(j).getOferta() == 0){ //Si la oferta es 0 quiere decir que tengo que elimiar al ofertante y llamar de nuevo a la funcion
				this.dellObs(this.obs.get(j));
				subasta();
			}else {
				
				this.setAux(this.obs.get(j).getOferta());	//Establesco la oferta como auxiliar
				if(this.getAux() > this.getMaxOferta()) {	//Comparo con la oferta maxima, si es mayor se reemplaza
			
					this.setPosicion(j);
					this.setMaxOferta(this.obs.get(j).getOferta());
				}
			}
			
			
		}
		
		return 1;
	}
	
	
	public void subastar() {
		
		
		while(this.producto.getPrecio_actual() < this.producto.getPrecio_final()) {
			this.setMaxOferta(0);
			this.setAux(0);
			this.setPosicion(0);
			this.ComunicarAll(); //Comunico el producto en cuestión a todos los ofertantes
			
			
			if(this.obs.size() == 0) { //Si no hay ofertantes se interrumpe el ciclo
				
				break;
			}
			else if(this.obs.size() == 1){ // Si solo queda un ofertante, ese es el que gana el producto
				
				break;
			}
			else {		//Si no ocurren ninguna de las condiciones anteriores se pasa a ver quien tiene la mayor oferta
				
				switch(subasta()) {
			
					case 1:
						if(this.obs.get(this.posicion).getOferta() == 0){
							break;
						}
						
						this.producto.setPrecio_actual(this.obs.get(this.posicion).getOferta());
						this.setGanador(this.obs.get(this.posicion));
						
						break;
					case 0:
						break;
				}
					
			}
			
		
		}
		
		
		
	}

	
	

}
