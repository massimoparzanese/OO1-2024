package ar.edu.unlp.info.oo1.VolumenSuperficieDeSolidos12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {
	private Cilindro cilindro;
	private double superficie;
	private double volumen;
	/*
	 * radio es primer parámetro, altura segundo
	 */
	@BeforeEach
	void setUp ()throws Exception {
		cilindro = new Cilindro("Rojo","Hierro",2, 3);
		superficie = 2 * Math.PI * 2 * 3 + 2 * Math.PI * Math.pow(2, 2);
		volumen = Math.PI * Math.pow(2, 2) * 3;
	}
	
	@Test
	void testVolumen() {
		assertEquals(volumen,cilindro.getVolumen());
	}
	
	@Test
	void testSuperficie() {
		
		assertEquals(superficie,cilindro.getSuperficie());
	}
	
	
	

}
