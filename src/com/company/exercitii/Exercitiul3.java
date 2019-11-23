package com.company.exercitii;
//Create an array and initialize it with the first 100 numbers that can be divided by 11.
// Create one method that initializes the array and one method that prints the contents of the array.
// Call them in main.

public class Exercitiul3 {
    public static void main(String[] args) {
        int[] array;
        array = initArray(100);
        printArray(array);
        array = initArray(200);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Metoda initArray imi intoarce un array cu primele limit numere divizibile cu 11
     * @param limit reprezinta cate numere sa imi contina array-ul
     * @return un array cu primele 100 de numere divizibile cu 11
     */
    private static int[] initArray(int limit) {
        int[] array = new int[limit];
        int count = 0;
        for (int i = 0; count < limit; i++) {
            if (i % 11 == 0) {
                array[count++] = i;
            }
        }return array;
    }
}
