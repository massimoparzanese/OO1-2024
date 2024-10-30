package ar.edu.unlp.info.oo1.LiquidacionDeHaberes20;

import java.time.LocalDate;

public abstract class Contrato {

	private LocalDate fechaInicio;
	
	
	public Contrato(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
	public abstract double sueldoBasico();
	
	public abstract int calcularDuracion();
	
	public abstract boolean noVencido();
}
