package ar.edu.unlp.info.oo1.VolumenSuperficieDeSolidos12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsferaTest {
	private Esfera esfera;
	private double volumen;
	private double superficie;
	/*
	 * radio es primer parámetro, altura segundo
	 */
	@BeforeEach
	void setUp () throws Exception  {
		esfera = new Esfera("Rojo","Hierro",2);
		superficie = 4 * Math.PI * Math.pow(2,2);
		volumen = (4 / 3) * Math.PI * Math.pow(2, 3);
	}
	
	@Test
	void testVolumen() {
		assertEquals(volumen,esfera.getVolumen());
	}
	
	@Test
	void testSuperficie() {
		assertEquals(superficie,esfera.getSuperficie());
	}
}
