package com.company;

    public class ReverseExample {
        public static void main(String[] args) {
            StringBuilder palindrom = new StringBuilder("rotater");
            System.out.println(palindrom);
            StringBuilder reversePalindrom = new StringBuilder(palindrom);
            palindrom.reverse();
            System.out.println(reversePalindrom);
            if (String.valueOf(palindrom).equalsIgnoreCase(String.valueOf(reversePalindrom))) {
                System.out.println("Nu este palindrom " + palindrom + " " + reversePalindrom);
            }
        }
    }
