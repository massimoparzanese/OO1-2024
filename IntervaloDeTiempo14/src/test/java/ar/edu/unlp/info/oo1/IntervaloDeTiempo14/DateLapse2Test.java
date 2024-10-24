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
	    @Test
	    public void testOverlaps() {
	        DateLapse2 dateLapse1= new DateLapse2(LocalDate.of(2024, 10, 10), 10);
	        DateLapse dateLapse2= new DateLapse(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 11));
	        DateLapse dateLapse3= new DateLapse(LocalDate.of(2024, 10, 19), LocalDate.of(2024, 10, 25));
	        DateLapse dateLapse4= new DateLapse(LocalDate.of(2024, 10, 11), LocalDate.of(2024, 10, 19));
	        DateLapse dateLapse5= new DateLapse(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 21));
	        DateLapse dateLapse6= new DateLapse(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 10));
	        DateLapse dateLapse7= new DateLapse(LocalDate.of(2024, 10, 20), LocalDate.of(2024, 10, 25));
	        DateLapse dateLapse8= new DateLapse(LocalDate.of(2024, 10, 10), LocalDate.of(2024, 10, 20));
	        DateLapse dateLapse9= new DateLapse(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 9));
	        DateLapse dateLapse10= new DateLapse(LocalDate.of(2024, 10, 21), LocalDate.of(2024, 10, 25));

	        assertTrue(dateLapse1.overlaps(dateLapse2));
	        assertTrue(dateLapse1.overlaps(dateLapse3));
	        assertTrue(dateLapse1.overlaps(dateLapse4));
	        assertTrue(dateLapse1.overlaps(dateLapse5));
	        assertTrue(dateLapse1.overlaps(dateLapse6));
	        assertTrue(dateLapse1.overlaps(dateLapse7));
	        assertTrue(dateLapse1.overlaps(dateLapse8));
	        assertFalse(dateLapse1.overlaps(dateLapse9));
	        assertFalse(dateLapse1.overlaps(dateLapse10));

	    }
}
