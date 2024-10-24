package ar.edu.unlp.info.oo1.ServicioDeEnvioDePaquetes;

import java.time.LocalDate;

public class Internacional extends Envio{

	
	public Internacional(LocalDate fecha, String direcOrigen, String direcDest, double peso) {
		super(fecha,direcOrigen,direcDest,peso);
		
	}
	
	
	public double monto() {
		if (getPeso() <= 1)
			return 5000 + (getPeso() * 10);
		return 5000 * (getPeso() * 12);
	}
}
