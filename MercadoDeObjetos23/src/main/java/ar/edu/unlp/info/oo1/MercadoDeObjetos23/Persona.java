package ar.edu.unlp.info.oo1.MercadoDeObjetos23;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Persona {

	private String nombre;
	private String direccion;
	
	public Persona(String direccion, String nombre) {
		this.nombre = nombre;	
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	
}
