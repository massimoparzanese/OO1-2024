package ar.edu.unlp.info.oo1.CuentaConGanchos;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta() {
		this.saldo=0;	
		}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositarMonto(double monto) {
		this.saldo +=monto;
	}
	
	protected void extraerSinControlar(double monto) {
		this.saldo-=monto;
		
	}
	
	
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)) {
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositarMonto(monto);
			return true;
		}
		return false;
	}
	protected abstract boolean puedeExtraer(double monto);
}
