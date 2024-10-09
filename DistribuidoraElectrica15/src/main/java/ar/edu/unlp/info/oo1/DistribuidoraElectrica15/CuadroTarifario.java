package ar.edu.unlp.info.oo1.DistribuidoraElectrica15;

public class CuadroTarifario {

		private double precioKwh;
		
		public CuadroTarifario(double precio) {
			this.precioKwh = precio;
		}
		
		public double getPrecioKwh() {
			return this.precioKwh;
		}
		
		public void cambiarPrecio(double precioNuevo) {
			this.precioKwh = precioNuevo;
		}
}
