import java.time.LocalDate;

public class ConsultaMedica extends ServicioMedico{

    public ConsultaMedica(Mascota m, LocalDate fechaAtencion, Medico medico){
        super(m,fechaAtencion,medico);
    }

    @Override
    public double adicionales() {
        return this.AniosMedico() * 100;
    }


}
