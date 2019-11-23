package ro.sdaacademy.javafundamentals.arrays;
import java.util.Scanner;

public class ArraysExercise
{
    public static void main(String[] args)
    {
        String[] arrayOfStrings = new String[5];
        Scanner in = new Scanner(System.in);

        for (int i=0; i < arrayOfStrings.length; i++ )
        {
            System.out.print("arrayOfStrings [" + i + "]=");
            arrayOfStrings[i] = in.nextLine();
            System.out.println(" -- ");
        }

        /* using enhanced for write the array
            format : (x,x,x,x,x)
         */
        System.out.print("(");
        for (String ss : arrayOfStrings) //enhanced for
        {
            //if (ss.equals(arrayOfStrings[4])) //daca pui acceasi valoare o sa afiseze fara virgule (11111)

            if (ss == (arrayOfStrings[4]))  //ca sa nu mai puna virgula si dupa ultima valoare a array-ului
            {
                System.out.print(ss);
            }
            else {
                System.out.print(ss + "," );
            }
        }
        System.out.print(")");
    }
}
