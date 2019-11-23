package com.company;

public class Palindrom12 {
    public static void main(String[] args){
        String palindrom = "Rotator";

        for(int i=0; i<palindrom.length(); i++){
            if(palindrom.charAt(i) != palindrom.charAt(palindrom.length() - i - 1)){
                System.out.println("Nu este palindrom " + palindrom.charAt(i) + "!=" + palindrom.charAt(palindrom.length() - i - 1));
                //palindrom.lenght -i-1. cuv are7 litere, dar prima pozitie e 0 si de aceea se scade1
                break;
            }
        }
    }
}
