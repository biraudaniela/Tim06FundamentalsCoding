package ro.sdaacademy.javafundamentals.varargs;

public class varArgsExemple {
    public static int getSum(int...args) {//getSum e o denumire ca sa sti ce face
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }//nu ruleaza nimic dar o putem folosi in alte programe



}
