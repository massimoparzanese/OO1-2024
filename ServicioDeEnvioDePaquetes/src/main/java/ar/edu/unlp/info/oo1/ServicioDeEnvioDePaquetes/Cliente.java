package ar.edu.unlp.info.oo1.ServicioDeEnvioDePaquetes;
import java.util.*;

import ar.edu.unlp.info.oo1.IntervaloDeTiempo14.DateLapse;
import ar.edu.unlp.info.oo1.IntervaloDeTiempo14.DateLapse2;

public abstract class Cliente {
    String nombre;
    String direccion;
    List<Envio> misEnvios;

    public Cliente (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.misEnvios = new ArrayList<Envio>();
    }
    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void addEnvio(Envio e){
        this.misEnvios.add(e);
    }

    public double montoAPagar(DateLapse fecha){
        return (this.misEnvios.stream()
        		.filter(e -> fecha.includesDate(e.getFecha()))
        		.mapToDouble(e -> e.monto()).sum()) * interes();
    }
    public abstract double interes();
}

