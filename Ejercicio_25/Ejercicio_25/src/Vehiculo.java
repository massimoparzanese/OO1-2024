public class Vehiculo {

    private String descripcion;
    private int capacidad;
    private int aniofab;
    private double valor;
    private Conductor conductor;

    public Vehiculo(String descripcion, int capacidad, int aniofab, double valor){
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.aniofab = aniofab;
        this.valor = valor;

    }
    // Getters
    public String getDescripcion(){
        return this.descripcion;
    }

    public int getCapacidad(){
        return this.capacidad;
    }
    public int getAniofab(){
        return this.aniofab;
    }
    public double getValor(){
        return this.valor;
    }
    public void setConductor(Conductor c){
        this.conductor = c;
    }
}
