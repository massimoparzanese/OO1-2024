package ar.edu.unlp.info.oo1.MercadoDeObjetos23;

public class ExpressADomicilio implements FormaDeEnvio {

	 private String direccionCli;
	 private String direccionV;
	 
	 public ExpressADomicilio(String direcCli, String direcV) {
		 
		 this.direccionCli = direcCli;
		 this.direccionV = direcV;
	 }
	 
	 public double getCosto() {
		 return 0.5 * CalculadoraDeDistancia .distanciaEntre(direccionV, direccionCli);
	 }
}
