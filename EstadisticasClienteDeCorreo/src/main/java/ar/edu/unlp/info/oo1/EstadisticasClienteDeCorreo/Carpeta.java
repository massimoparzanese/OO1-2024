package ar.edu.unlp.info.oo1.EstadisticasClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Carpeta {
  private List<Email> emails;
  
  
  public Carpeta() {
	  emails = new ArrayList<Email>();
  }
  public List<Email> getEmails(){
	  return new ArrayList<Email>(this.emails);
  }
  public void agregarEmail(Email email) {
	  this.emails.add(email);
  }
  
  public void mover(Email email, Carpeta destino) {
	  destino.agregarEmail(email);
	  this.emails.remove(email);
  }
  
  public Email buscar(String texto) {
	return this.emails.stream().filter(email -> email.contieneTexto(texto)).findFirst().orElse(null);}
  
  public int tamaño() {
	  return this.emails.stream().mapToInt(e -> e.tamaño()).sum();
  }
  
  public int cuantosTengo() {
	  return this.emails.size()
  }
}
