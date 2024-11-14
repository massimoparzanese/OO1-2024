import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Conductor extends Usuario {

    Vehiculo miAuto;

    public Conductor(String nombre, double saldo, Vehiculo v){
        super(nombre,saldo);
        this.miAuto = v;
        this.miAuto.setConductor(this);
    }

    public Viaje darAltaViaje(String origen, String destino, double costo, LocalDate fecha){
        if(ChronoUnit.DAYS.between(LocalDate.now(),fecha) >= 2){
            Viaje v = new Viaje(origen,destino,costo,this,fecha,this.miAuto);
            return v;}
        else return null;
    }

    /*
    * Retorna la comision a cobrar para el conductor
    * */
    @Override
    public double comision() {
        if((LocalDate.now().getYear() - (this.miAuto.getAniofab()) < 5))
            return 0.99;
        else return 0.90;
    }

    /*
     * Le descuenta el saldo correspondiente al conductor
     * */
    @Override
    public double cobrar(double cobro) {
        this.descontarSaldo(cobro - (this.miAuto.getValor() * 0.001));
        return getSaldo();
    }
}
