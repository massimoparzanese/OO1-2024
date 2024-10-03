package ar.edu.unlp.info.oo1.ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {
  private List<Archivo> adjuntos;
  private String titulo;
  private String cuerpo;
  
  
  public Email(String titulo, String cuerpo) {
	  this.titulo = titulo;
	  this.cuerpo = cuerpo;
	  this.adjuntos = new ArrayList<Archivo>();
  }
  public String getTitulo() {
	  return this.titulo;
  }
  
  public String getCuerpo() {
	  return this.cuerpo;
  }
  
  public List<Archivo> getAdjuntos(){
	  return new ArrayList<Archivo>(this.adjuntos);
  }
  
  public void agregarAdjunto(Archivo arch) {
	  this.adjuntos.add(arch);
  }
  public boolean contieneTexto(String texto) {
	  return (this.cuerpo.contains(texto) || this.titulo.contains(texto));
  }
  public int tamaño() {
	  return this.cuerpo.length() + this.titulo.length() + this.adjuntos.stream().mapToInt(a -> a.tamaño()).sum();
  }
  
}
