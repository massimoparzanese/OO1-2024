package ar.edu.info.unlp.ejercicioDemo;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item() {
		this.detalle = "Undefined";
		this.cantidad = 0;
		this.costoUnitario = 0;
		
		
	}
	
	public Item(String detalle,int cantidad,double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public String getDetalle() {
		return this.detalle;
	}
	public int getCantidad() {
		return this.cantidad;
		
	}
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public double costo() {
		return this.costoUnitario * this.cantidad;
	}

}
