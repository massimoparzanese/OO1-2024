package ar.edu.unlp.info.oo1.ElInversor11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPlazoFijo {
	
	PlazoFijo plazoFijo;
	
	@BeforeEach
	void setUp() throws Exception{
		plazoFijo = new PlazoFijo(23,2);
		
	}
	
	@Test
	void TestCreation() {
		assertEquals(plazoFijo.getMontoDepositado(),plazoFijo.valorActual());
	}

}
