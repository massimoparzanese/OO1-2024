import java.time.LocalDate;

public class ServicioDeGuarderia extends Servicio{
    private DateLapse2 lapso;

    public ServicioDeGuarderia(Mascota m, DateLapse2 lapso){
        super(m);
        this.lapso = lapso;
    }

    @Override
    public double calcularCosto() {
        if(this.getMascota().tengoMas())
            return (500 * this.lapso.getSizeInDays()) * 0.90;
       return 500 * this.lapso.getSizeInDays();
    }

    @Override
    public boolean esIgual(LocalDate fecha) {
        return (lapso.includesDate(fecha));
    }
}
