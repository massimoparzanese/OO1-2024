package ar.edu.unlp.info.oo1.ejercicio4;

public class Producto {
	
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecio() {
		return this.peso * this.precioPorKilo;	
		}

}
