package ar.edu.unlp.info.oo1.VolumenSuperficieDeSolidos12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {
	
	private ReporteDeConstruccion reporteDeConstruccion;
	private Cilindro cilindro;
	private Esfera esfera;
	private Esfera esferaDos;
	
	@BeforeEach
	void setUp() throws Exception{
		reporteDeConstruccion = new ReporteDeConstruccion();
		esfera = new Esfera("Rojo","Hierro",2);
		esferaDos = new Esfera("Rojo","Plastico",2);
		cilindro = new Cilindro("Rosa","Hierro",2, 3);
		reporteDeConstruccion.agregarPieza(cilindro);
		reporteDeConstruccion.agregarPieza(esfera);
		reporteDeConstruccion.agregarPieza(esferaDos);
	}
	
	@Test
	void testVolumen() {
		assertEquals(esfera.getVolumen()+cilindro.getVolumen(),reporteDeConstruccion.volumenDeMaterial("Hierro"));
	}
	
	@Test
	void testSuperficie() {
		assertEquals(esfera.getSuperficie()+esferaDos.getSuperficie(),reporteDeConstruccion.superficieDeColor("Rojo"));
	}

}
