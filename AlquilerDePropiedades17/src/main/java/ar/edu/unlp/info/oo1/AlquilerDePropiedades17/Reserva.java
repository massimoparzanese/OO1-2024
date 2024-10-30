package ar.edu.unlp.info.oo1.AlquilerDePropiedades17;

import ar.edu.unlp.info.oo1.IntervaloDeTiempo14.DateLapse2;
import ar.edu.unlp.info.oo1.IntervaloDeTiempo14.DateLapseOverall;

public class Reserva {
	private double precio;
	private DateLapseOverall lapso;
	
	public Reserva(double precioTotal, DateLapseOverall lapso) {
		this.precio = precioTotal;
		this.lapso = lapso;
	}
	
	public double getPrecioTotal() {
		return this.precio;
	}
	
	public DateLapseOverall getFechaReserva() {
		return this.lapso;
	}
	
	public boolean seSuperpone(DateLapseOverall fecha) {
		return (this.lapso.overlaps(fecha));
	}
	
	public boolean estaIncluida(DateLapseOverall fecha) {
		return (fecha.includesDate(this.lapso.getFrom()) && fecha.includesDate(this.lapso.getFrom()));
	}
}
