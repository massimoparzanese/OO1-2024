package ar.edu.unlp.info.oo1.MercadoDeObjetos23;

import java.util.ArrayList;
import java.util.List;



public class Vendedor extends Persona{
	private List<Producto> misProductos;
	
	public Vendedor(String direccion, String nombre) {
		super(direccion, nombre);
		this.misProductos = new ArrayList<Producto>();
	}
	
	public boolean crearPedido(Producto p, int cant, Usuario u, FormaDePago fp, FormaDeEnvio fe) {
		if(this.misProductos.contains(p)) {
		  return p.crearPedido(cant, u, fp, fe);
		}
		return false;
	}
	
	
	

	

}
