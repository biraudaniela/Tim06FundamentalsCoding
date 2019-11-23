package com.company;

public class test {
    public static void main(String[] args){
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Str2 = "";
        Str2 = String.copyValueOf(Str1);
        System.out.println("Returned String: " + Str2);
    }
}