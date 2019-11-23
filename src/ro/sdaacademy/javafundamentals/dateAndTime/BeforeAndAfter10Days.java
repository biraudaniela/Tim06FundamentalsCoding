package ro.sdaacademy.javafundamentals.dateAndTime;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public class BeforeAndAfter10Days {
    //get the dates 10 days before and after today
    //write a java pr to get day-in-week name
    public static void main(String[] args){

        LocalDate astazi = LocalDate.now();
        LocalDate acumZeceZile;
        LocalDate dupaZeceZile;
        acumZeceZile = astazi.minus(10, DAYS);
        dupaZeceZile = astazi.plus(10,DAYS);

        //acumZeceZile = astazi.minusDays(10);
        // dupaZeceZile = dupaZeceZile.plusDays(10);


        LocalDate acumUnAn = astazi.minus(1,YEARS);

        System.out.println(astazi);
        System.out.println(acumZeceZile);
        System.out.println(dupaZeceZile);
        System.out.println(acumUnAn);
    }
}
