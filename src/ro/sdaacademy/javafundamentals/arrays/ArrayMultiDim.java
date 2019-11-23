package ro.sdaacademy.javafundamentals.arrays;
public class ArrayMultiDim {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},              //a[0] e un array,  a[0][0] e un int
                {4, 5, 6, 9},
                {7},
        };

        for (int i = 0; i< a.length; i++){
            for (int j : a[i]){
                System.out.println(j);
            }
        }
    }
}
