package ar.edu.unlp.info.oo1.CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		super();
	}
	
	
	
	protected boolean puedeExtraer(double monto) {
		 return ((this.getSaldo() - (monto * 1.02)) > 0);

	}
	
	
	
	
}
