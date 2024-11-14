import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.time.*;
public class Viaje {

    private List<Usuario> integrantes;
    private String origen;
    private String destino;
    private double costo;
    private LocalDate fecha;
    private Vehiculo vehiculo;


    public Viaje(String origen, String destino, double costo,Usuario u, LocalDate fecha, Vehiculo v){
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fecha = fecha;
        this.integrantes = new ArrayList<Usuario>();
        this.vehiculo = v;
        this.agregarPasajero(u);
    }

    /*
    retorna true si tengo capacidad pude agregar al pasajero al viaje
    * */
    public boolean agregarPasajero(Usuario u) {
        if (tengoCapacidad() && (ChronoUnit.DAYS.between(LocalDate.now(),this.fecha) >= 2)) {
            this.integrantes.add(u);
            return true;
        }
        return false;
    }

    /*
    retorna true si tengo capacidad para agregar al pasajero
    * */
    private boolean tengoCapacidad (){
        if(this.integrantes.size() == this.vehiculo.getCapacidad())
            return false;
        return true;
    }

    /*
    retorna true si la fecha recibida está dentro de los ultimos 30 dias
    * */
    public boolean dentro(LocalDate fecha){
        return(ChronoUnit.DAYS.between(fecha,this.fecha) <= 30);
    }

    private double costoPorIntegrante(){
        return this.costo / this.integrantes.size();
    }

    /*
    Al finalizar el viaje le cobra a cada integrante lo que le corresponde
    * */
    public void procesarViaje(){
        this.integrantes.stream().forEach(i -> i.cobrar(this.costoPorIntegrante()));
    }
}
