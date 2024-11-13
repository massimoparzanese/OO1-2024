package ar.edu.unlp.info.oo1.EstadisticasClienteDeCorreo;

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
  /*
  Este metodo retorna el valor el cual se le asigna al mail segun
  su tamaño
   */
  public String clasificarPorTamanio(){
      int tamaño =this.tamaño();
      if(tamaño <= 300){
          return "Pequeño";
      }else if(tamaño > 300 && tamaño < 501){
          return "Mediano";
      }else{
          return "Grande";
      }
  }
  
}
