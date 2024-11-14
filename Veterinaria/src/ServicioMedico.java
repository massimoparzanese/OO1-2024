import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class ServicioMedico extends Servicio {
    private LocalDate fechaAtencion;
    private Medico medico;

    public ServicioMedico(Mascota m, LocalDate fechaAtencion,Medico medico){
        super(m);
        this.fechaAtencion = fechaAtencion;
        this.medico = medico;
    }

    public double calcularCosto(){
        if(esDomingo())
            return this.medico.getHonorariosACobrar() +500 + 100 + adicionales();
        else return this.medico.getHonorariosACobrar() + 500 + adicionales();
    }
    public boolean esIgual(LocalDate fecha){
       return (this.fechaAtencion.isEqual(fecha));
    }
    private boolean esDomingo(){
        return (this.fechaAtencion.getDayOfWeek() == DayOfWeek.SUNDAY);
    }
    public int AniosMedico(){
        return this.medico.getAntiguedad();
    }
    public abstract double adicionales();
}
