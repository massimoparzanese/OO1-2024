package ar.edu.unlp.info.oo1.VolumenSuperficieDeSolidos12;

public class Esfera extends Pieza {
	
	private int radio;
	
	public Esfera(String color, String material, int radio) {
		super(color,material);
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}

		/*
		 * ⁴⁄₃ * π * radio ³.
		 */
	public double getVolumen() {
		return (4 / 3) * Math.PI * Math.pow(this.radio, 3); 
	}
	
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(this.radio,2);
	}
}
