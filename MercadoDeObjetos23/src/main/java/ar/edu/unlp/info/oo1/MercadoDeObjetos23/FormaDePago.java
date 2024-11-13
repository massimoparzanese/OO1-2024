package ar.edu.unlp.info.oo1.MercadoDeObjetos23;

public abstract class FormaDePago {
	
	
	public double getPrecioFinal(Producto p, int cant) {
		return (p.getPrecio() * cant) * this.getInteres();
		
	}
	
	public abstract double getInteres();
	
	
	

}
