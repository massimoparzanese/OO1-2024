package ar.edu.unlp.info.oo1.ServicioDeEnvioDePaquetes;

import ar.edu.unlp.info.oo1.IntervaloDeTiempo14.DateLapse;
import ar.edu.unlp.info.oo1.IntervaloDeTiempo14.DateLapse2;

public class Fisico extends Cliente {
	
	private int dni;
	
	public Fisico(String nombre, String direc, int dni) {
		super(nombre,direc);
		this.dni = dni;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	
	public double interes() {
		return 0.90;
	}

}
