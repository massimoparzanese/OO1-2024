import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Medico {
    private String nombre;
    private LocalDate fechaIngreso;
    private double honorariosACobrar;

    public Medico(String nombre, LocalDate fechaIngreso, double Honorarios){
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.honorariosACobrar = Honorarios;
    }

    public int getAntiguedad(){
        return (int) ChronoUnit.YEARS.between(fechaIngreso,LocalDate.now());
    }

    public double getHonorariosACobrar(){
        return this.honorariosACobrar;
    }


}
