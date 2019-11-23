package ro.sdaacademy.javafundamentals.homeTest;

public class testAngajat {
    public static void main(String[] args){
        Angajat a1 = new Angajat("john snow");
        Angajat a2 = new Angajat("cersei");
        a1.varstaAngajat(24);
        a1.postAngajat("manager");
        a1.salariuAngajat(3500);
        a2.varstaAngajat(25);
        a2.postAngajat("secretara");
        a2.salariuAngajat(2500);
        a1.printeazaangajat();
        a2.printeazaangajat();

    }
}
