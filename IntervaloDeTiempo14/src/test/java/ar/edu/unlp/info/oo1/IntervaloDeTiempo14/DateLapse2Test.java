package ar.edu.unlp.info.oo1.IntervaloDeTiempo14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapse2Test {
	  private DateLapse2 lapso;
	    private LocalDate f1;

	    @BeforeEach
	    void setUp() throws Exception{
	        f1 = LocalDate.of(2023,10,10);
	        lapso = new DateLapse2(f1, 10);
	    }

	    @Test
	    void TestGetDateTo(){
	        LocalDate f2 = LocalDate.of(2023,10,20);
	        assertEquals(f2,lapso.getDateTo());
	    }

	    @Test
	    void TestIncludesDate(){
	        LocalDate f2 = LocalDate.of(2023,12,10);
	        LocalDate f3 = LocalDate.of(2023,10,15);
	        assertTrue(lapso.includesDate(f3));
	        assertFalse(lapso.includesDate(f2));
	    }
}
