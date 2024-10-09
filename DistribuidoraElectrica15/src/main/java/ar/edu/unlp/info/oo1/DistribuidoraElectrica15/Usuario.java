package ar.edu.unlp.info.oo1.DistribuidoraElectrica15;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre; 
		this.domicilio = domicilio;
		consumos = new ArrayList<Consumo>();
	}


	public String getNombre() {
		return nombre;
	}


	public String getDomicilio() {
		return domicilio;
	}
	
	public void agregarConsumo(Consumo consumo) {
		consumos.add(consumo);
	}
	
	public Consumo obtenerConsumo() {
		if (this.consumos.size() != 0)
			return this.consumos.get(this.consumos.size() - 1);
		else return null;
		/*return this.consumos.stream().reduce((first, second) -> second).orElse(null);*/
	}


	
	
}
