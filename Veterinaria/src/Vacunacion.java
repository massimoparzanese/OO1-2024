import java.time.LocalDate;

public class Vacunacion extends ServicioMedico{
    private String nombreVacuna;
    private double costoVacuna;
    private Medico med;
    private Mascota mascota;

    public Vacunacion(Mascota m, LocalDate fechaAtencion, Medico medico, String nombreVacuna, double costoVacuna) {
        super(m, fechaAtencion, medico);
        this.nombreVacuna = nombreVacuna;
        this.costoVacuna = costoVacuna;
    }

    @Override
    public double adicionales() {
        return this.costoVacuna;
    }
}
