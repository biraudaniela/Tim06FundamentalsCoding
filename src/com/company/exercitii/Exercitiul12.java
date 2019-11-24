package com.company.exercitii;
/*
12. Create an application with a menu and with accepting parameters when starting.
We are going to create a jar and run it with some arguments.
Create a menu that will enable you to select the desired functionality and will stop when the read data is
equal to a certain parameter out of the command line. E.g: the app will be customized to display the name of the user -u name. -q “exit prog”. Etc.
**) Save the current time that you opened the app. You should have an option in the menu that prints the time spent in the app.
Write a Java program to sum values of an array. Read the size and read the numbers
Write a Java program to calculate the average value of array elements
Write a Java program to remove a specific element from an array. Also change the size of the array
Write a Java program to insert an element (specific position) into an array
Write a Java program to find the second largest element in an array.
Write a Java program to find the number of even and odd integers in a given array of integers
Write a Java program to compute the average value of an array of integers except the largest and smallest values
 Write a Java program to cyclically rotate a given array clockwise by one
Create a program that reads a number in a method. Then create another method that can print a reverse triangle of the size given by the parameter
****
 * *
  *
Create a program that reads two numbers. Then create another method that can print a rectangle of the size given by the parameter.
Create also another method that can print the rectangle and the diagonals.
Read a seuqnce of numbers separated by space. Print the sum of them and product. Also the difference between the biggest and the smallest.
Read a sequence of numbers from the keyboard separated by ;. Print the new numbers as a difference between the sum of the others and the actual number
Read a big number from the keyboard (let’ say 20 digits). Compute the division by a one digit number.
*/

import java.util.Scanner;

public class Exercitiul12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Punct1(input);
        Punct2(input);

    }
    //Write a Java program to sum values of an array. Read the size and read the numbers
    public static void Punct1( Scanner input){
        System.out.println("Dimensiune array : ");
        int dim = input.nextInt();
        int[] array = readArray(dim);
        System.out.println("Suma elementelor din array : " + sumArray(array));
    }
    // Write a Java program to calculate the average value of array elements
    public static void Punct2(Scanner input){
        System.out.println("Dimensiune array : " );
        int dim = input.nextInt();
        int[] array = readArray(dim);
        int medie = sumArray(array) / dim;
        System.out.println(medie);

    }
    public static int[] readArray(int size){
        Scanner input = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Array["+ (i+1) + "]=" );
            array[i] = input.nextInt();
        }
        return array;
    }
    public static int sumArray(int[] array){
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
