package ar.edu.unlp.info.oo1.ServicioDeEnvioDePaquetes;

public class Corporativo extends Cliente{
	 
	private int cuit;
	
	public Corporativo(String nombre, String direc, int cuit) {
		super(nombre,direc);
		this.cuit = cuit;
	}
	
	public int getCuit() {
		return this.cuit;
	}
	
	public double interes() {
		return 1;
	}

}
