package com.company;

    public class Palindrom {
        public static void main(String[] args) {
            String palindrom = "rotator";
            for(int i=0; i< palindrom.length(); i++) {
                System.out.println(palindrom.charAt(i) + " - " + palindrom.charAt(palindrom.length()-i-1));
                if( !String.valueOf(palindrom.charAt(i))
                        .equalsIgnoreCase(String.valueOf(palindrom.charAt(palindrom.length()-i-1)))){
                    System.out.println("Nu este palindrom " + palindrom.charAt(i)  + " != " + palindrom.charAt(palindrom.length()-i-1));
                    break;
                }
            }
        }
    }

/*Borcan si Camara sunt diferite de celelalte , au ceva modificari. Astea sunt puse in alt package,deobicei noi cand deschidem alt proiect
 package-ul apare ca com.company, noi am creat altul asa: click dreapta pe src -> new -> package -> ro.sdaacademy.javafundamentals
(asa il cheama) si le creezi pe rand mai intai ro, apoi in ro creezi sdaacademy si asa mai departe

Poti sa ai mai multe package-uri pt cazul in care ai mai multe clase cu acelasi nume, poti sa le rulezi dar din diferite package-uri ,
cazul borcan si camara :)

Iar ca sa muti programe deja create in alt package dai click dreapta pe program ->Refactor -> Move class ->si selectezi unde vrei sa o muti*/
