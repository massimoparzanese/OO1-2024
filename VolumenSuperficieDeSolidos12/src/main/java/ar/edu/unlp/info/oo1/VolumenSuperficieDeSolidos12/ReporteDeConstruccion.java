package ar.edu.unlp.info.oo1.VolumenSuperficieDeSolidos12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	public double volumenDeMaterial(String material) {
		return this.piezas.stream().filter(p -> p.esDeMaterial(material)).mapToDouble(p -> p.getVolumen()).sum();
	}
	
	public double superficieDeColor(String color) {
		return this.piezas.stream().filter(p -> p.esColor(color)).mapToDouble(p -> p.getSuperficie()).sum();
	}
}
