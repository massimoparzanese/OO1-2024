package ar.edu.unlp.info.oo1.VolumenSuperficieDeSolidos12;

public abstract class Pieza {
	private String color;
	private String material;
	
	public Pieza(String color, String material) {
		this.color = color;
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	

	public String getMaterial() {
		return material;
	}
	
	public boolean esDeMaterial(String material) {
		return this.material.equals(material);
	}

	public boolean esColor(String color) {
		return this.color.equals(color);
	}
	public abstract double getVolumen();
	public abstract double getSuperficie();
	

	
	
	

}
