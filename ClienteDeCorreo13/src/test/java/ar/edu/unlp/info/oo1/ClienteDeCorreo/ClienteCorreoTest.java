package ar.edu.unlp.info.oo1.ClienteDeCorreo;

import org.junit.jupiter.api.BeforeEach;

public class ClienteCorreoTest {
	private ClienteDeCorreo clienteDeCorreo;
	private Carpeta carpeta;
	private Carpeta carpetaDos;
	private Carpeta inbox;
	private Email emailUno;
	private Email emailDos;
	
	@BeforeEach
	void setUp() throws Exception {
		inbox = new Carpeta();
		carpeta = new Carpeta();
		carpetaDos = new Carpeta();
		emailUno = new Email("OO1","Bienvenido");
		emailDos = new Email("OO2","Buenos días");
		clienteDeCorreo = new ClienteDeCorreo(inbox);
	}
}
