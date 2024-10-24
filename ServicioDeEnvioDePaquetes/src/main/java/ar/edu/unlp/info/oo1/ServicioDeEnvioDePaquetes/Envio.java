package ar.edu.unlp.info.oo1.ServicioDeEnvioDePaquetes;

import java.time.LocalDate;

public abstract class Envio {
	
	 private LocalDate fecha;
	 private String direcOrigen;
	 private String direcDest;
	 private double peso;
	 
	 public Envio(LocalDate fecha, String direcOrigen, String direcDest, double peso) {
		 this.fecha = fecha;
		 this.direcOrigen = direcOrigen;
		 this.direcDest = direcDest;
		 this.peso = peso;
	 }

	public LocalDate getFecha() {
		return fecha;
	}

	public String getDirecOrigen() {
		return direcOrigen;
	}

	public String getDirecDest() {
		return direcDest;
	}

	public double getPeso() {
		return peso;
	}
	
	public abstract double monto();
	 
	 

}
