package ar.edu.unlp.info.oo1.EstadisticasClienteDeCorreo;

public class Archivo {
 private String nombre;
 
 
 public Archivo(String nombre) {
	 this.nombre = nombre;
 }
public String getNombre() {
	 return this.nombre;
 }
 
 public int tamaño() {
	 return this.nombre.length();
 }
}
