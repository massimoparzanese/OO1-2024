package ar.edu.unlp.info.oo1.DistribuidoraElectrica15;

public class Consumo {
	private double activa;
	private double reactiva;
	
	
	
	public Consumo(double act, double pas) {
		this.activa = act;
		this.reactiva = pas;
	}
	
	public double getActiva() {
		return activa;
	}
	public double getPasiva() {
		return reactiva;
	}
	
	public double obtenerFactorPotencia() {
		return this.activa / Math.sqrt(Math.pow(this.activa, 2) + Math.pow(this.reactiva, 2));
	}
}
