package com.company.exercitii;
//Write a piece of code that counts from 1 to 1000, with increments of 5.
// It prints to the console only the numbers composed of the same digit.
// Use all 3 loop operators. The code shall be placed in a new method, called from main.
// Also print the last number (1000)
public class Exercitiul1 {

    public static void main(String[] args) {
        afisare();
    }

    private static void afisare() {
        for(int i=0; i<=1000;i+=5){
            if(i==5||i==55||i==555||i==1000){
                System.out.println("Numerele sunt :"+ i);
            }
        }
    }

}
