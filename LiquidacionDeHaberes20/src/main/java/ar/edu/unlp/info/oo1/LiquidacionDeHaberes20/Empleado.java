package ar.edu.unlp.info.oo1.LiquidacionDeHaberes20;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private String apellido;
	private int cuit;
	private boolean tieneConyuge;
	private boolean tieneHijos;
	private List<Contrato> misContratos;
	
	
	public Empleado(String nombre, String apellido, int cuit, boolean tieneC, boolean tieneH) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuit = cuit;
		this.tieneConyuge = tieneC;
		this.tieneHijos = tieneH;
		this.misContratos = new ArrayList<Contrato>();
	}
	// Crea un recibo de sueldo del empleado y lo devuelve
	public ReciboDeSueldo generarReciboSueldo() {
		ReciboDeSueldo recibo = new ReciboDeSueldo(this.nombre,this.apellido,this.cuit, this.calcularAntiguedad(),this.obtenerContratoActual().sueldoBasico());
		return recibo;
	
}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getCuit() {
		return cuit;
	}

	public boolean isTieneConyuge() {
		return tieneConyuge;
	}

	public boolean isTieneHijos() {
		return tieneHijos;
	}
	
	private Contrato obtenerContratoActual() {
		return this.misContratos
				.stream().filter(contr -> contr.noVencido()).findFirst().orElse(null);
	}
	
	public boolean aniadirContrato(Contrato cont) {
		Contrato contrato = this.obtenerContratoActual();
		if(contrato != null) {
			this.misContratos.add(cont);
			return true;}
		return false;
	}
	
	public int calcularAntiguedad() {
		return 0;
	}
}