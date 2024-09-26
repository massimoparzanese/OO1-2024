package ar.edu.unlp.info.oo1.ElInversor11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo1.ElInversor11.*;


public class TestInversor {
	Inversor inversor;
	PlazoFijo plazoFijo;
	List<Inversion> inversiones;
	
	@BeforeEach
	void setUp() throws Exception{
		inversor = new Inversor("Juan");
		plazoFijo = new PlazoFijo(23,2);
		inversiones = new ArrayList<Inversion>();
		inversiones.add(plazoFijo);
		
	}
	
	@Test
	void testCreation () {
		assertEquals("Juan",inversor.getNombre());
		assertEquals(0,inversor.valorActual());
	}
	
	@Test
	void testAgregar() {
		inversor.agregarInversion(plazoFijo);
		assertEquals(inversiones,inversor.getInversiones());
	}
	
	@Test
	void testSumaInversiones() {
		inversor.agregarInversion(plazoFijo);
		assertEquals(plazoFijo.valorActual(),inversor.valorActual());
	}
}
