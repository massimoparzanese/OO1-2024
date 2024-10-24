package ar.edu.unlp.info.oo1.ServicioDeEnvioDePaquetes;

import java.time.LocalDate;

public class Local extends Envio{
	
	private boolean rapido;
	
	public Local(LocalDate fecha, String direcOrigen, String direcDest, double peso,boolean rapido) {
		 super(fecha,direcOrigen,direcDest,peso);
		 this.rapido = rapido;
	}
	
	public boolean esRapido() {
		return rapido;
	}
	
	public double monto() {
		if (rapido)
			return 1500;
		else return 1000;
	}
}
