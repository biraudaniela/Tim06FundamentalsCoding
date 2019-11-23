package ro.sdaacademy.javafundamentals.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ReadYearFromKeyboard {
    //write a java pr to show the date after reading years
    // monts and days from console
    public static void main(String[] args) {
        System.out.println("Year");
        Scanner in = new Scanner(System.in);
        String year = in.nextLine();

        System.out.println("Month");
        String month = in.nextLine();

        System.out.println("Day");
        String day = in.nextLine();

        System.out.println(year + " " + month + " " +day);
        LocalDate aDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        System.out.println(aDate);

    }
}
