package ar.edu.unlp.info.oo1.LiquidacionDeHaberes20;

import java.time.LocalDate;

public class ReciboDeSueldo {
/*
 * el nombre, apellido, CUIL y antigüedad 
 * en la empresa del empleado al que pertenece 
 * el recibo; la fecha en la que fue generado el recibo; 
 * y el monto total que le corresponde cobrar al empleado según el contrato vigente. 
 */
	private String nombre;
	private String apellido;
	private int cuil;
	private int antiguedad;
	private LocalDate fecha;
	private double montoTotal;
	
	public ReciboDeSueldo(String nombre,String apellido,int cuil, int antiguedad, double montotal) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.antiguedad = antiguedad;
		this.fecha = LocalDate.now();
		this.montoTotal = montotal;
		
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getCuil() {
		return cuil;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public double getMontoTotal() {
		return montoTotal;
	}
	
	
	
	
}
