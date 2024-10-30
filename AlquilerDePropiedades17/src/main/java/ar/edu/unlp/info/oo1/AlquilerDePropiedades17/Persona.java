package ar.edu.unlp.info.oo1.AlquilerDePropiedades17;
import java.util.*;

import ar.edu.unlp.info.oo1.IntervaloDeTiempo14.DateLapseOverall;
public class Persona {
	private int dni;
	private String nombre;
	private String direccion;
	private List<Propiedad> misPropiedades;
	
	
	public Persona(int dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		misPropiedades = new ArrayList<Propiedad>();
	}


	public int getDni() {
		return dni;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDireccion() {
		return direccion;
	}
	
	/*
	 * Este método calcula los ingresos totales de el propietario, 
	 * recorriendo todas sus propiedades calculando
	 * la suma de los alquileres de c/u en un 75% en un periodo
	 * */
	
	public double calcularIngresos(DateLapseOverall fecha) {
		return this.misPropiedades.stream().mapToDouble(prop -> prop.retornarGanancias(fecha)).sum();
	}
}
