package ro.sdaacademy.javafundamentals.dateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DifferenceBetween2Dates {
    //compute difference between 2 dates y m d
    public static void main(String[] args) {
        LocalDate firstDate = citesteDeLaTastatura();
        LocalDate secconddate = citesteDeLaTastatura();
        System.out.println(firstDate);
        System.out.println(secconddate);

        Period perioada = Period.between(firstDate,secconddate);
        System.out.println(perioada);
    }

public static LocalDate citesteDeLaTastatura(){
    System.out.println("Year");
    Scanner in = new Scanner(System.in);
    String year = in.nextLine();

    System.out.println("Month");
    String month = in.nextLine();

    System.out.println("Day");
    String day = in.nextLine();
            int yearIntFormat = Integer.parseInt(year);
            int monthIntFormat = Integer.parseInt(month);
            int dayIntFormat = Integer.parseInt(day);
            return LocalDate.of(yearIntFormat,monthIntFormat,dayIntFormat);
    }
  }
