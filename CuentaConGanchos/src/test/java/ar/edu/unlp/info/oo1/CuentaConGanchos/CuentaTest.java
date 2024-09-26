package ar.edu.unlp.info.oo1.CuentaConGanchos;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class CuentaTest {
	
	CuentaCorriente cuentaCorriente;
	CajaDeAhorro cajaDeAhorro;
	
	
	 @BeforeEach
	  void setUp() throws Exception {
		 cajaDeAhorro = new CajaDeAhorro();
		 cuentaCorriente = new CuentaCorriente();
		 cajaDeAhorro.depositarMonto(400);
		 cuentaCorriente.depositarMonto(300);
		 
	 }
	 @Test
	 void Testdepositar() {
		
		 assertEquals(400, cajaDeAhorro.getSaldo());
		 assertEquals(300, cuentaCorriente.getSaldo());
	 }
	 @Test
	 void TestExtraer(){
		 cajaDeAhorro.depositarMonto(400);
		 cuentaCorriente.depositarMonto(100);
		 assertTrue(cajaDeAhorro.extraer(200));
		 assertFalse(cajaDeAhorro.extraer(800));
		 assertTrue(cuentaCorriente.extraer(300));
		 assertFalse(cuentaCorriente.extraer(1000));
	}
	 
	 @Test
	 void TestTransferir() {
		 assertTrue(cajaDeAhorro.transferirACuenta(100, cuentaCorriente));
		 assertFalse(cajaDeAhorro.transferirACuenta(1000, cuentaCorriente));
		 assertTrue(cuentaCorriente.transferirACuenta(200, cajaDeAhorro));
		 assertFalse(cuentaCorriente.transferirACuenta(1000, cajaDeAhorro));
	 }
	 
	 @Test
	 void TestDepositar() {
		 cajaDeAhorro.depositarMonto(500);
		 assertEquals(900,cajaDeAhorro.getSaldo());
		 cuentaCorriente.depositarMonto(300);
		 assertEquals(600,cuentaCorriente.getSaldo());
	}
	 
	 @Test
	 void TestDescubierto() {
		 cuentaCorriente.setDescubierto(200);
		 assertEquals(-200,cuentaCorriente.getDescubierto());
		 
	 }
	 
}
