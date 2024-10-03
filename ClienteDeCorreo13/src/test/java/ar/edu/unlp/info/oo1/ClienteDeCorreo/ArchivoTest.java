package ar.edu.unlp.info.oo1.ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {
	private Archivo archivo;
	
	@BeforeEach
	void setUp() throws Exception{
		archivo = new Archivo("Texto.txt");
		
	}
	
	@Test
	void testTamaño(){
		assertEquals(9,archivo.tamaño());
	}
}
