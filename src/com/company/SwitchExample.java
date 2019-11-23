package com.company;
import java.util.Scanner;

public class SwitchExample
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);


        /*
        read from keyboard CNP
        verify first digit and print
        Male/Female

        1digit of CNP
        1,3,5 Male
        2,4,6 Female
         */


        switch(ss.charAt(0))
        {
            case '1':
            case '3':
            case '5':
                System.out.println("Male");
                break;
            case '2':
            case '4':
            case '6':
                System.out.println("Female");
                break;
            default:
                System.out.println("Undentified");
        }
    }

}
