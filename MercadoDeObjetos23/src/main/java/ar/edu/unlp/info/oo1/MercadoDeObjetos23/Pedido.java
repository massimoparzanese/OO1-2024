package ar.edu.unlp.info.oo1.MercadoDeObjetos23;

public class Pedido {
	
	private FormaDePago metodoPago;
	private Producto producto;
	private FormaDeEnvio formaEnvio;
	private int cant;
	
	public Pedido(FormaDePago formaPago, Producto p, FormaDeEnvio formaEnvio, int cant) {
		this.cant = cant;
		this.producto = p;
		this.metodoPago = formaPago;
		this.formaEnvio = formaEnvio;
		
	}
	public FormaDePago getMetodoPago() {
		return metodoPago;
	}
	public Producto getProducto() {
		return producto;
	}
	public FormaDeEnvio getFormaEnvio() {
		return formaEnvio;
	}
	public int getCant() {
		return cant;
	}
	
	public double cosTotal() {
		return this.formaEnvio.getCosto() + this.metodoPago.getPrecioFinal(producto, cant);
	}
	
	public String devolverCat() {
		return this.producto.getCategoria();
	}
	
	
	

}
