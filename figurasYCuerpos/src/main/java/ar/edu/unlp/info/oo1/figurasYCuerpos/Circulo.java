package ar.edu.unlp.info.oo1.figurasYCuerpos;
import java.util.*;
public class Circulo implements Figura{
	private double radio;
	
	
	
	public Circulo() {
		this.radio = 0;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getDiametro() {
		return this.radio * 2;
	}
	
	
	public double getPerimetro() {
		return (this.getDiametro() * Math.PI);

	}
	
	public double getArea() {
		return ((Math.pow(this.radio, 2)) * Math.PI);
		
	}
	
	
}
