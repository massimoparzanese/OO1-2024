package ar.edu.unlp.info.oo1.CuentaConGanchos;

public class CuentaCorriente extends Cuenta {
 private double Descubierto;
 
 public CuentaCorriente() {
	 super();
	 this.Descubierto = 0;
 }
 
 public double getDescubierto() {
	 return this.Descubierto;
 }
 
 public void setDescubierto(double monto) {
	 this.Descubierto = 0 - monto;
 }
 
 

 protected boolean puedeExtraer(double monto) {
	 return ((this.getSaldo() - monto) >= (this.Descubierto));
 }
}
