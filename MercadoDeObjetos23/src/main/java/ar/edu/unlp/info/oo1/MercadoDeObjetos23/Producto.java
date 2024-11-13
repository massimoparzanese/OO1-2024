package ar.edu.unlp.info.oo1.MercadoDeObjetos23;

public class Producto {
	
	private String nombre;
	private String categoria;
	private double precio;
	private int cant;
	
	
	public String getNombre() {
		return nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public int getCant() {
		return cant;
	}
	
	public boolean tengoStock(int cant) {
		if((this.cant - cant) >= 0)
			return true;
		else
			return false;
	}
	
	public void disminuirCant(int solicitado) {
		this.cant = this.cant - solicitado;
	}
	
	public boolean crearPedido( int cant, Usuario u, FormaDePago fp, FormaDeEnvio fe) {
		if(this.tengoStock(cant)) {
			this.disminuirCant(cant);
			Pedido pedido = new Pedido(fp,this,fe,cant);
			u.aniadirPedido(pedido);
			return true;
		}
	return false;
	}
	

}
