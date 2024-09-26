package ar.edu.unlp.info.oo1.ElInversor11;

public class InversionEnAcciones implements Inversion{
	
	private String nombre;
    private int cantidad;
    private double valorUnitario;
    
	public String getNombre() {
		return nombre;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	
	public double valorActual() {
		return this.valorUnitario * this.cantidad;
	}
	
    
    
	

}
