package ro.sdaacademy.javafundamentals.oop;

public class Camara {

    public static void main(String[] args) {
        Borcan borcan1 = new Borcan("Castraveti");
        System.out.println(borcan1.getContinut());
        System.out.println(borcan1.totalBorcane); //total borcane = 1

        Borcan borcan2 = new Borcan("Castraveti");
        System.out.println(borcan2.totalBorcane); // total borcane = 2
        System.out.println(borcan1.totalBorcane); //total borcane = 2
        System.out.println(--Borcan.totalBorcane); //total borcane = 1 fiindca -- e inainte
        System.out.println(Borcan.totalBorcane); // total borcane = 1


        System.out.println(borcan1.equals(borcan2));

    }
}