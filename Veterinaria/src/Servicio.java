import java.time.LocalDate;

public abstract class Servicio {

    private Mascota mascota;

    public Servicio(Mascota m){
        this.mascota = m;
    }

    public abstract double calcularCosto();

    public abstract boolean esIgual(LocalDate fecha);

    public Mascota getMascota(){
        return this.mascota;
    }

}
