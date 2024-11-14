import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario {

    private List<Viaje> misViajes;

    public Pasajero(String nombre, double real) {
        super(nombre, real);
        this.misViajes = new ArrayList<Viaje>();
    }


    public boolean agregarViaje(Viaje v){
        if(tengoSaldo() && v.agregarPasajero(this)){
            this.misViajes.add(v);
            return true;
        }
        return false;

    }

    /*
    * Si tengo un viaje en los ultimos 30 días
    * se me cobra sin una comisión, y si no
    * se cobra un 10% de comision
    * */
    @Override
    public double comision() {
        Viaje aux = this.misViajes.stream().filter(v -> v.dentro(LocalDate.now())).findFirst().orElse(null);
        if(aux != null)
            return 1;
        else return 1.1;
    }
    /*
    * Le cobra el valor del viaje al pasajero
    * */
    @Override
    public double cobrar(double cobro) {
        this.descontarSaldo(cobro - 500);
        return getSaldo();
    }
}
