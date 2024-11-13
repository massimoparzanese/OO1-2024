package ar.edu.unlp.info.oo1.LiquidacionDeHaberes20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PorHoras extends Contrato {

		private LocalDate fechaFin;
		private double valor;
		private double horas;
		
		public PorHoras(LocalDate inicio, LocalDate fin, double valor, double horas) {
			super(inicio);
			this.fechaFin = fin;
			this.valor = valor;
			this.horas = horas;
		}
		
		public LocalDate getFechaFin() {
			return fechaFin;
		}
		public double getValor() {
			return valor;
		}
		public double getHoras() {
			return horas;
		}

		
		public double sueldoBasico(boolean hijos, boolean conyuge) {
			return this.valor * this.horas;
		}

		
		public int calcularDuracion() {
			return (int) ChronoUnit.MONTHS.between(this.getFechaInicio(), this.fechaFin);
		}

		
		public boolean noVencido() {
			return(this.fechaFin.isBefore(LocalDate.now()) || this.fechaFin.isEqual(LocalDate.now()));
		}
		
		
		
}
