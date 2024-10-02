package ar.edu.unlp.info.oo1.VolumenSuperficieDeSolidos12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrismaRectangularTest {
	private PrismaRectangular prismaRectangular;
	private double superficie;
	private double volumen;
	/*
	 * lado mayor, lado menor, altura(orden de parámetros)
	 */
	
	@BeforeEach
	void setUp() throws Exception{
		prismaRectangular = new PrismaRectangular("Rosa","Papel",2,2,3);
		superficie = 2 * (2 * 2 + 2 * 3 + 2 * 3);
		volumen = 2*2*3;
	}
	
	@Test
	void testVolumen() {
		assertEquals(volumen,prismaRectangular.getVolumen());
	}
	
	
	@Test
	void testSupercie() {
		assertEquals(superficie,prismaRectangular.getSuperficie());
	}
}
