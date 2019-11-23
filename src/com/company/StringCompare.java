package com.company;

public class StringCompare {
    public static void main(String[] args){
        String a = "abc";
        String b = new String ("abc");
        System.out.println(a==b);//false
        // =testaza valorile
        System.out.println(a.equals(b));//true
        //equals testeaza obiectele

    }
}
