package com.company;

public class PrintVariable {
    public static void main(String[] args){
        byte oneByte = 23;
        int intVar = oneByte;
        float oneFloat = oneByte;
        /**
         *
         * using printf write ahexa of the value above in format XX XX XX XX
         *
         */
        System.out.printf("%08x%n", intVar);
    }
}
