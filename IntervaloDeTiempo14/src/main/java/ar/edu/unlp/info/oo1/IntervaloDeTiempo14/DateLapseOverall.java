package ar.edu.unlp.info.oo1.IntervaloDeTiempo14;

import java.time.LocalDate;

public interface DateLapseOverall {
    public boolean includesDate(LocalDate d);
    
    public LocalDate getFrom();
    
    public int getSizeInDays();
    
    public LocalDate getDateTo();

    /**
     Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro
     **/
    public boolean overlaps (DateLapseOverall anotherDataLapse);


}
