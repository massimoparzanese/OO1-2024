package ar.edu.unlp.info.oo1.ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	
	private Carpeta carpeta;
	private Carpeta carpetaDos;
	private Email emailUno;
	private Email emailDos;
	
	@BeforeEach
	void setUp() throws Exception {
		carpeta = new Carpeta();
		carpetaDos = new Carpeta();
		emailUno = new Email("OO1","Bienvenido");
		emailDos = new Email("OO2","Buenos días");
		carpeta.agregarEmail(emailUno);
		carpetaDos.agregarEmail(emailDos);
	}
	
	@Test
	void buscarTest() {
		assertEquals(emailUno,carpeta.buscar("OO1"));
		assertEquals(emailDos,carpetaDos.buscar("OO2"));
	}
	
	@Test 
	void tamañoTest() {
		assertEquals(emailUno.tamaño(), carpeta.tamaño());
		assertEquals(emailDos.tamaño(), carpetaDos.tamaño());
	}
	
	@Test
	void testMover() {
		carpeta.mover(emailUno, carpetaDos);
		assertEquals(0,carpeta.tamaño());
		assertEquals(emailUno,carpetaDos.buscar("OO1"));
		assertEquals(emailUno.tamaño() + emailDos.tamaño(),carpetaDos.tamaño());
	}

}
