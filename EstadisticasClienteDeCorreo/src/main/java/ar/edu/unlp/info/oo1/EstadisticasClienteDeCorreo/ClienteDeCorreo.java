package ar.edu.unlp.info.oo1.EstadisticasClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ClienteDeCorreo {
	
	private List<Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo(Carpeta carpeta) {
		this.carpetas = new ArrayList<Carpeta>();
		this.inbox = carpeta;
	}
	
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		Email email = this.inbox.buscar(texto);
		if(email != null)
			return email;
		return this.carpetas.stream()
				.map(c -> c.buscar(texto)).filter(Objects::nonNull)
				.findFirst().orElse(null);
	}
	  public void addCarpeta(Carpeta c){
	        this.carpetas.add(c);
	    }
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(carpetas -> carpetas.tamaño()).sum() + this.inbox.tamaño();
	}
	
	public int cuantosTengo() {
		return this.inbox.cuantosTengo() + this.carpetas.stream().mapToInt(carpeta -> carpeta.cuantosTengo()).sum();
	}
}