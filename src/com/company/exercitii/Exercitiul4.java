package com.company.exercitii;
//Create a program that reads a text from the keyboard.
// Create a method that prints the letters and the numbers of apparitions in the read text.

import java.util.Scanner;

public class Exercitiul4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println(text);

        char[] litere = new char[text.length()];
        int[] contorDeLitere = new int[text.length()];

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                continue;
            }
            boolean isDuplicate = false;
            for (int j = 0; j <= i; j++) {
                if (litere[j] == text.charAt(i)) {
                    contorDeLitere[j]++;
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false) {
                for (int j = 0; j < litere.length; j++) {
                    if (litere[j] == 0) {
                        litere[j] = text.charAt(i);
                        contorDeLitere[j] = 1;
                        break;
                    }
                }
            }
        }
        afisare(litere);
        afisare(contorDeLitere);

    }

    private static void afisare(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void afisare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                break;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
