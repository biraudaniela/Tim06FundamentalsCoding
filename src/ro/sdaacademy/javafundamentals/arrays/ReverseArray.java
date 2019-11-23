package ro.sdaacademy.javafundamentals.arrays;

public class ReverseArray {
        public static void main(String[] args)
        {
            int [] a = {10, 20, 30, 40, 50};
            int n = a.length;
            int[] b = new int[n];
            for (int i = 0;i<a.length; i++) {
                b[i] = a[n-1];
              n--;
                System.out.print(b[i] + ",");
        }
        }
}