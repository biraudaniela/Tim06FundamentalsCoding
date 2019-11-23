package ro.sdaacademy.javafundamentals.arrays;
import ro.sdaacademy.javafundamentals.varargs.varArgsExemple;
import java.util.Scanner;

public class ArrayEX {

    /*read from keyboard the array dimensions m and n
     *create and int array of dimension [m,n]
     * read from keyboard all values in the array
     *
     * calculate
     *  1. min value
     *  2. max value
     *  3. sum of all values using VarArgsUrtils.getSum method
     *  4. calculate average value
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("m= ");
        int m = Integer.parseInt(in.nextLine()); //nr de coloane
        System.out.print("n= ");
        int n = Integer.parseInt(in.nextLine()); //nr de linii

        System.out.println("Create array of dimensions (" + m + "," + n + ")");
        int[][] array = new int[m][n]; //creezi matricea

        int min = Integer.MAX_VALUE; // fiindca cu ce o comparam trebuie sa fie mai mic decat min actual
        int max = Integer.MIN_VALUE; // la fel ca min
        int sum = 0;

        System.out.println("Please input values");
        for (int i = 0; i< m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("array[" + i + "," + j + "]=");
                array[i][j] = Integer.parseInt(in.nextLine());  //introduci elementele din matrice
                if (array[i][j] < min){     //daca valoarea e mai mica ca min, devine noul min
                    min = array[i][j];
                }
                if (array[i][j] > max){    //daca valoarea e mai mare ca max devine noul max
                    max = array[i][j];
                }
            }
            sum += varArgsExemple.getSum(array[i]); //folosesti programul pt suma

        }
        System.out.println("Min value = " + min);
        System.out.println("Max value = " + max);
        System.out.println("Sum = " + sum);
        System.out.println("Averege value = " + sum/(m*n));
    }
}
