package ar.edu.unlp.info.oo1.MercadoDeObjetos23;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo1.Bag21.Bag;
import ar.edu.unlp.info.oo1.Bag21.BagImpl;

public class Usuario extends Persona{

	private List<Pedido> misPedidos;
	public Usuario(String direccion, String nombre) {
		super(direccion, nombre);
		this.misPedidos = new ArrayList<Pedido>();
	}
	
	public boolean aniadirPedido(Pedido p) {
		
		return this.misPedidos.add(p);
		
	}
	
	public Bag<String> prodPorCategoria(){
		BagImpl<String> bag = new BagImpl<String>();
		this.misPedidos.forEach(pedido -> bag.add(pedido.devolverCat()));
		return bag;
	}

}
