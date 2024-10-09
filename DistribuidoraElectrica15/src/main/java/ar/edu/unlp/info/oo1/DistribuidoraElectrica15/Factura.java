package ar.edu.unlp.info.oo1.DistribuidoraElectrica15;

import java.time.LocalDate;

public class Factura {
	private LocalDate fechaOmision;
	private Usuario usuario;
	private CuadroTarifario cuadroTarifario;
	
	public Factura(Usuario usuario, double precioKwh) {
		this.fechaOmision = LocalDate.now();
		this.usuario = usuario;
		this.cuadroTarifario = new CuadroTarifario(precioKwh);

	}
	
	public LocalDate getFechaOmision() {
		return fechaOmision;
	}
	
	public double getBonificacion() {
		if(this.usuario.obtenerConsumo().obtenerFactorPotencia() >= 0.8) 
			return this.getMontoTotal() - ((this.getMontoTotal() * this.usuario.obtenerConsumo().obtenerFactorPotencia()) / 100);
		else return 0;
	}
	
	public double getMontoTotal() {
		return (this.usuario.obtenerConsumo().getActiva() 
				* this.cuadroTarifario.getPrecioKwh()) - this.getBonificacion();
	}
	
}
