package ar.edu.unlp.info.oo1.ElInversor11;

import java.util.ArrayList;
import java.util.List;
public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		inversiones = new ArrayList<Inversion>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarInversion(Inversion inver) {
		this.inversiones.add(inver);
	}
	
	public List<Inversion> getInversiones(){
		return new ArrayList<Inversion>(this.inversiones);
	}
	public double valorActual() {
		
		return (inversiones.stream().mapToDouble(inv -> inv.valorActual()).sum());
	}
	
	
	

}
