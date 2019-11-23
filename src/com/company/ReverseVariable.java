package com.company;

import java.util.Scanner;

public class ReverseVariable {
    public static void main(String[] args){
        System.out.println("Introduceti valoarea lui a!");
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        System.out.println(" a = " + a);
        System.out.println("Introduceti valoarea lui b!");
        int b = Integer.parseInt(input.nextLine());
        System.out.println(" b = " + b);

        int c = b;
        b = a;
        System.out.println("\nSe inverseaza valorile variabilelor a si b");
        System.out.println(" b = " + b);
        a = c;
        System.out.println(" a = " + a);
        System.out.printf(" a=%d ", a);


    }
}