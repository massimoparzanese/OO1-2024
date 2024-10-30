package ar.edu.unlp.info.oo1.LiquidacionDeHaberes20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DePlanta extends Contrato{
	
	private double sueldoMes;
	private double montoConyuge;
	private double montoHijos;
	private boolean hijos;
	private boolean conyuge;

	public DePlanta(LocalDate fechaInicio, double sueldoM, double montoC, double montoH,boolean hijos, boolean conyuge) {
		super(fechaInicio);
		this.sueldoMes = sueldoM;
		this.montoConyuge = montoC;
		this.montoHijos = montoH;
		this.hijos = hijos;
		this.conyuge = conyuge;
	}

	public double getSueldoMes() {
		return sueldoMes;
	}

	public double getMontoConyuge() {
		return montoConyuge;
	}

	public double getMontoHijos() {
		return montoHijos;
	}

	@Override
	public double sueldoBasico() {
		double total = this.sueldoMes;
		if (this.hijos) 
			total += this.montoHijos;
		
		if(this.conyuge) 
			total+= this.montoConyuge;
		return total;
	}

	@Override
	public int calcularDuracion() {
		return (int) ChronoUnit.MONTHS.between(this.getFechaInicio(), LocalDate.now());
	}

	@Override
	public boolean noVencido() {
		return false;
	}
	
	
	
	

}
