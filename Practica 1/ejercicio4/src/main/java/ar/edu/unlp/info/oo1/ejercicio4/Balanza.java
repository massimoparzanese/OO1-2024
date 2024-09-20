package ar.edu.unlp.info.oo1.ejercicio4;
import java.util.*;
public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.productos = new ArrayList<Producto>();
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPrecioTotal() {
//		double total = 0;
//		for(Producto producto:productos) {
//			total = total + producto.getPrecio();
//		}
//		return total;
		return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}
	
	public double getPesoTotal() {
		return productos.stream().mapToDouble(p -> p.getPeso()).sum();
	}
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public Ticket emitirTicket() {
		
		Ticket t= new Ticket(this.productos.size(),this.getPesoTotal(),this.getPrecioTotal());
		ponerEnCero();
		return t;

	}
	
	
}
