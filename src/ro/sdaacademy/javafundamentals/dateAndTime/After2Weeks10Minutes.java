package ro.sdaacademy.javafundamentals.dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class After2Weeks10Minutes {
    //write a java pr to get a date after 2 weeks and 10 minutes
    public static void main(String[] args){
        LocalDateTime astaziAcum = LocalDateTime.now();
        LocalDateTime raspuns = astaziAcum.plusWeeks(2).plusMinutes(10);
    }

}
