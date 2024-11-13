package ar.edu.unlp.info.oo1.PollCar24;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Persona {

	private String nombre;
	private double saldo;
	
	public Persona(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
		
	}

	public String getNombre() {
		return nombre;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void cargarSaldo(double saldo) {
		this.saldo = (this.saldo + saldo) * comision();
	}
	
	public abstract double comision();
		
	
	public abstract double cobrar(double cobro);

	
}
