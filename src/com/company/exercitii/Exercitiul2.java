package com.company.exercitii;

import java.util.Scanner;

/*Write a code that reads from the console two positive numbers.
Then create a loop that counts from 1 until it is equal to the second read number and prints the number.
 The increment is the first read number. The numbers are read inside main, and they are passed as parameters to another method.
Obs: Search what System.currentTimeMillis() does. Do you need it somewhere?*/
public class Exercitiul2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        System.out.println(" n = " + n);

        int m = Integer.parseInt(input.nextLine());
        System.out.println(" m = " + m);
        while (m < 0 || n< 0) {
            n = Integer.parseInt(input.nextLine());
            m = Integer.parseInt(input.nextLine());
        }
        pozitive(n, m);

    }

    private static void pozitive(int n, int m) {
        long x = System.currentTimeMillis();

            for (int i = 1; i != m; i = i + n) {
                System.out.println(i + " ");
                if(System.currentTimeMillis()-x > 10000){
                    break;
                }
        }
    }
}