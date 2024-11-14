import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ViajeTest {
    private Viaje v;
    private Conductor conductor;
    private Vehiculo vehiculo;
    private Pasajero pasajero;
    @BeforeEach
    void setUp() throws Exception{
        LocalDate fecha = LocalDate.of(2024, 12, 12);
        vehiculo = new Vehiculo("Blanco",4,2014,200000);
        conductor = new Conductor("Juan",3000, vehiculo);
        pasajero = new Pasajero("Pedro", 5000);
        v = new Viaje("Plaza paso","Facultad de informática",4000,conductor,fecha,vehiculo);
    }

    @Test
    void FueHace30Dias(){
        assertTrue(v.dentro(LocalDate.now()));
    }

    @Test
    void agergarPasajeroTest(){
        assertTrue(v.agregarPasajero(pasajero));
        assertTrue(v.agregarPasajero(pasajero));
        assertTrue(v.agregarPasajero(pasajero));
        assertFalse(v.agregarPasajero(pasajero));
    }
}
