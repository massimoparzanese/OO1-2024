package ar.edu.unlp.info.oo1.ReddeAlumbrado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Farola {
	
	private boolean prendida;
	private List<Farola> Neighbors;
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		this.prendida = false;
		this.Neighbors = new ArrayList<Farola>();
	}
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		this.Neighbors.add(otraFarola);
		if(!otraFarola.getNeighbors().contains(this))
			otraFarola.pairWithNeighbor(this);
			
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.Neighbors.stream().collect(Collectors.toList());
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(!this.prendida) {
			this.prendida = true;
			this.Neighbors.stream().forEach(neighbor -> neighbor.turnOn());
			}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.prendida) {
			this.prendida = false;
			this.Neighbors.stream().forEach(neighbor -> neighbor.turnOff());
			}
	}



	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.prendida;
	}
	
	public boolean isOff() {
		return (!this.prendida);
	}


}
