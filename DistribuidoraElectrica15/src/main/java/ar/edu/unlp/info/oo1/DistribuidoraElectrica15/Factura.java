package ar.edu.unlp.info.oo1.DistribuidoraElectrica15;

import java.time.LocalDate;

public class Factura {
	private LocalDate fechaOmision;
	private Usuario usuario;
	private CuadroTarifario cuadroTarifario;
	
	public Factura(Usuario usuario, CuadroTarifario cuadroTarifario) {
		this.fechaOmision = LocalDate.now();
		this.usuario = usuario;
		this.cuadroTarifario = cuadroTarifario;

	}
	
	public LocalDate getFechaOmision() {
		return fechaOmision;
	}
	
	public boolean getBonificacion() {
		return (this.usuario.obtenerConsumo().obtenerFactorPotencia() >= 0.8) ;
			
	}
	
	private double obtenerPrecioActiva(double act, double precio) {
		return act * precio;
	}
	public double getMontoTotal() {
		double act = this.usuario.obtenerConsumo().getActiva();
		double precio = this.cuadroTarifario.getPrecioKwh();
		if(this.getBonificacion())
			return (this.obtenerPrecioActiva(act, precio) - (this.obtenerPrecioActiva(act, precio) * 0.10));
		else
		return (this.obtenerPrecioActiva(act, precio));
				  
	}
	
}
