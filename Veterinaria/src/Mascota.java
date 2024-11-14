import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre;
    private LocalDate fecNac;
    private String especie;
    private List<Servicio> misServicios;

    public Mascota(String nombre, LocalDate nacimiento, String especie){
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.especie = especie;
        this.misServicios = new ArrayList<Servicio>();
    }

    public boolean aniadirServicio(Servicio s){
        if(s != null){
        this.misServicios.add(s);
        return true;}
        else return false;
    }

    public boolean tengoMas(){
        return(this.misServicios.size() >= 5);
    }

    public ServicioMedico darAltaConsulta(Medico m){
        ConsultaMedica consul = new ConsultaMedica(this,LocalDate.now(),m);
        if (this.aniadirServicio(consul)){
            return consul;
        }
        else return null;


    }

    public ServicioMedico darAltaVacunacion(Medico m, String nombreVacuna, double costo){
        Vacunacion vacunacion = new Vacunacion(this,LocalDate.now(), m, nombreVacuna,costo);
        if(this.aniadirServicio(vacunacion))
            return vacunacion;
        return null;
    }

    public Servicio darAltaServicioGuarderia(int cantDias){
        DateLapse2 lapso = new DateLapse2(LocalDate.now(), cantDias);
        ServicioDeGuarderia serv = new ServicioDeGuarderia(this, lapso);
        if(this.aniadirServicio(serv))
            return serv;
        return null;
    }

    public double recGenerada(LocalDate fecha){
        return this.misServicios.stream().filter(s -> s.esIgual(fecha)).mapToDouble(s -> s.calcularCosto()).sum();
    }

}
