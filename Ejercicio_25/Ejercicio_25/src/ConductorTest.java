import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ConductorTest {
    private Conductor c;
    private Vehiculo v;

    @BeforeEach
    void setUp() throws Exception{
        v = new Vehiculo("Blanco",4,2014,200000);
        c = new Conductor("Juan",3000, v);

    }

    @Test
    void agregarViajeTest(){
        LocalDate fecha = LocalDate.of(2024, 12, 12);
        LocalDate fecha2 = LocalDate.of(2024, 11, 13);
        assertNotNull(c.darAltaViaje("Plaza paso","Facultad de informática",4000,fecha));
        assertNull(c.darAltaViaje("Plaza paso","Facultad de informática",4000,fecha2));
    }

    @Test
    void agregarSaldoTest(){
        c.cargarSaldo(500);
        assertEquals(c.getSaldo(),450);
    }

    @Test
    void cobrarTest(){
        c.cargarSaldo(500);
        assertEquals(c.cobrar(300),450);

    }
}
