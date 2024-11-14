public abstract class Usuario {
    private String nombre;
    private double saldo;

    public Usuario(String nombre, double real){
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public boolean tengoSaldo(){
        return (this.saldo >= 0);
    }

    // Carga el saldo y le cobra una comisión
    public void cargarSaldo(double saldo){
        this.saldo = (this.saldo + saldo) * this.comision();
    }

    // descuenta de su saldo actual
    protected void descontarSaldo(double nuevo){
        this.saldo = this.saldo - nuevo;
    }
    public abstract double comision();

    public abstract double cobrar(double cobro);
}
