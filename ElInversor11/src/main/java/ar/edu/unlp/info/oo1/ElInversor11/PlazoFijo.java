package ar.edu.unlp.info.oo1.ElInversor11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(double montoDepositado, double porcentajeDeInteresDiario) {
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
		this.fechaDeConstitucion = LocalDate.now();
	}
	
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}
	
	public double getMontoDepositado() {
		return montoDepositado;
	}
	
	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}
	
	public double valorActual() {
		int diasDiferencia = (int) ChronoUnit.DAYS.between(LocalDate.now(),this.fechaDeConstitucion);
		return (this.montoDepositado + (this.porcentajeDeInteresDiario * diasDiferencia));
	}

}
