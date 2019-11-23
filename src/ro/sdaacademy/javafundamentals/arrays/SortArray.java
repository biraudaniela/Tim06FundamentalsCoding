package ro.sdaacademy.javafundamentals.arrays;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
    public static void main(String[] args){
        Random rnd = new Random();//generam un vector
        int[] array = new int[]{
             rnd.nextInt(9),//limita maxima a nr
                rnd.nextInt(7),
                rnd.nextInt(6),
                rnd.nextInt(3),
                rnd.nextInt(915)

        };
        System.out.println(Arrays.toString(array));
      boolean sorted = true;
        while(sorted){
            sorted =false;
        for(int i=0; i < array.length - 1; i++) {//ciclam pana la lenght -1  sa nu iesim din lungime
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                sorted = true;
            }
        }
        }
        //sau Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
/* boolean sorted = true;
       do {
           sorted = true;
           for (int i = 0; i < array.length - 1; i++) {
               if (array[i] > array[i + 1]) {
                   int tmp = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = tmp;
                   sorted = false;
               }
           }
       } while (!sorted);
       //Arrays.sort(array);
       System.out.println(Arrays.toString(array));
   }*/