package ro.sdaacademy.javafundamentals.dateAndTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class DayInWeek {
    //write a java pr to get day-in-week name
    public static void main(String[] args){
        LocalDate  acum = LocalDate.now();
        System.out.println(acum);

        System.out.println();

        LocalDateTime acumCuTimp = LocalDateTime.now();
        System.out.println(acumCuTimp);

        System.out.println();

        Instant chiarAcum = Instant.now();//relativ la utc si gmt, de la epoch time
        System.out.println(chiarAcum);

        System.out.println(Instant.EPOCH);

        ZonedDateTime acumCuFus = ZonedDateTime.now();
        System.out.println(acumCuFus);

    }
}
