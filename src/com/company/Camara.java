package com.company;

public class Camara {
    public static void main(String[] args){
        Borcan borcan1 = new Borcan();
        borcan1.setContinut("Castraveti");
        System.out.println(borcan1.getContinut());

        Borcan borcan2 = new Borcan();
        borcan2.setContinut("Castraveti");
        System.out.println(borcan2.getContinut());
       // borcan1 = borcan2;//instanta borcan 1 nu se mai pooate accesa, garbage colector, I

        System.out.println(borcan1.equals(borcan2));//sunt doua borcane asemanatoare nu identice

       int x = 3;//este o valoare
        //Integer int2 = new Integer(value:1);//boxing
        //if (int1 ==(n))

       // int x =  4; System.out.println(x++); System.out.println(--x); System.out.println(x % 3); System.out.println(11 % 2); System.out.println(7 % x++); System.out.println(x == 4); System.out.println(x != 4); x = 10; int y = 5; System.out.println(x == 10 && y <= 5); System.out.println(x <= y && y > 5); System.out.println(„abc” instanceof String);




    }
}