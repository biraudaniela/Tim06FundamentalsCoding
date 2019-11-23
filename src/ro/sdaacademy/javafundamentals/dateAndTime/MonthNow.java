package ro.sdaacademy.javafundamentals.dateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class MonthNow {
    //write a java pr the month

    public static void main(String[] args){
        LocalDate astazi = LocalDate.now();

        Month lunaCorespZileiDeAzi = astazi.getMonth();

        int numarulDeZile = lunaCorespZileiDeAzi.maxLength();

        System.out.println(numarulDeZile);

        System.out.println(astazi.getMonthValue());

    }
}
