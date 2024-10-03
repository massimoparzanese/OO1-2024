package ar.edu.unlp.info.oo1.ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {

		private Email email;
		private Archivo archivoUno;
		private Archivo archivoDos;
		
		@BeforeEach
		void setUp() throws Exception {
			email = new Email("OO1","Bienvenido");
			archivoUno = new Archivo("Hola.txt");
			archivoDos = new Archivo("texto.txt");
			email.agregarAdjunto(archivoUno);
			email.agregarAdjunto(archivoDos);
			
		}
		
		@Test
		void testTamaño() {
			assertEquals(30,email.tamaño());
		}
}
