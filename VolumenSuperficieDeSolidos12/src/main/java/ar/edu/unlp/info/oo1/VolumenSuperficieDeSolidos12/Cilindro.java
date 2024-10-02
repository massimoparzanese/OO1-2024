package ar.edu.unlp.info.oo1.VolumenSuperficieDeSolidos12;

public class Cilindro extends Pieza {
	
	private int altura;
	private int radio;

	public Cilindro(String color, String material, int radio, int altura ){
		super(color,material);
		this.radio = radio;
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	

	public double getRadio() {
		return radio;
	}

	@Override
	public double getVolumen() {
		return Math.PI * Math.pow(this.radio, 2) * this.altura;	
		}
	
	/*
	 * 2 * π * radio  * h + 2 * π * radio 2 
	 */
	@Override
	public double getSuperficie() {
		return 2 * Math.PI * this.radio * this.altura + 2 * Math.PI * Math.pow(this.radio, 2);
	}
	
	

	
	
	

}
