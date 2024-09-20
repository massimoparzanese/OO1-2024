package ar.edu.unlp.info.oo1.GenealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	
	public Mamifero() {
		this.identificador = "Undefined";
		this.especie = "Undefined";
		this.fechaNacimiento  = LocalDate.now();
	}
	
	public Mamifero(String id) {
		this.identificador = id;
		this.especie = "Undefined";
		this.fechaNacimiento  = LocalDate.now();
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	
	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return true;
	}
}
