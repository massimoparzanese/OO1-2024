package ar.edu.info.unlp.ejercicioDemo;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void agregarProducto(Producto producto) {
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
		this.cantidadDeProductos += 1;
	}
	
	public Ticket emitirTicket() {
		
		Ticket tick = new Ticket(this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
		return tick;
	}
	
	
}
