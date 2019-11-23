package ro.sdaacademy.javafundamentals.dateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class MonthsRemaining {
    //write a java pr to get the months in the year
    LocalDate astazi = LocalDate.now();

    Month lunaCorespZileiDeAzi = astazi.getMonth();{
        LocalDate astazi = LocalDate.now();

        //int lunaCorespZileiDeAzi = astazi.getMonthValue();
        int auMaiRamasCateLuni = 12- astazi.getMonthValue();
        //System.out.println(lunaCorespZileiDeAzi);
        System.out.println(auMaiRamasCateLuni);


    }
}
