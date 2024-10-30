package ar.edu.unlp.info.oo1.AlquilerDePropiedades17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.info.oo1.IntervaloDeTiempo14.DateLapse;
import ar.edu.unlp.info.oo1.IntervaloDeTiempo14.DateLapse2;
import ar.edu.unlp.info.oo1.IntervaloDeTiempo14.DateLapseOverall;

public class Propiedad {
	private String direccion;
	private String nombreDescriptivo;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	public Propiedad(String direccion, String nombreDescriptivo, double precioPorNoche) {
		this.direccion = direccion;
		this.nombreDescriptivo = nombreDescriptivo;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
	}
	
	public boolean consultarDisponibilidad(DateLapse2 fecha) {
		Reserva aux = this.reservas
				.stream().filter(res -> res.seSuperpone(fecha)).findFirst().orElse(null);
		return (aux == null);
	}
	
	public Reserva crearReserva(DateLapse2 fecha) {
		if(this.consultarDisponibilidad(fecha)) {
			Reserva reserva = new Reserva(fecha.getSizeInDays() * this.precioPorNoche, fecha);
			this.reservas.add(reserva);
			return reserva;
		}
		return null;
	}
	
	public boolean cancelarReserva(Reserva r){
		if (this.reservas.contains(r)) {
			this.reservas.remove(r);
			return true;}
		return false;
    }
	
	public double retornarGanancias(DateLapseOverall fecha) {
		return (0.75 * this.reservas.stream().filter(res -> res.estaIncluida(fecha)).mapToDouble(res -> res.getPrecioTotal()).sum());
	}
	}

