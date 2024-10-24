package ar.edu.unlp.info.oo1.ServicioDeEnvioDePaquetes;

import java.time.LocalDate;

public class Interurbano extends Envio {
	
	private double km;
	public Interurbano(LocalDate fecha, String direcOrigen, String direcDest, double peso, double km) {
	   super(fecha, direcOrigen,direcDest, peso);
	   this.km = km;
	}
	public double getKm() {
		return km;
	}
	
	public double monto() {
		double mult = 0;
		if(km < 100) {
			mult = 20;
		}
		else if ((km >= 100) && (km > 500)){
			mult = 25;
		}
		else mult = 30;
		
		return getPeso() * mult;
	}
}
