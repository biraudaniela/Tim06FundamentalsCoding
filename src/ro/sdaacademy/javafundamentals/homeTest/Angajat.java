package ro.sdaacademy.javafundamentals.homeTest;

public class Angajat {
    String nume;
    int varsta;
    String post;
    double salariu;

    public Angajat(String nume){
        this.nume = nume;
    }
    public void varstaAngajat( int varstaAngajat) {

        varsta = varstaAngajat;
    }
    public void postAngajat( String postAngajat){
        post = postAngajat;
    }
    public void salariuAngajat( double salariuAngajat){
        salariu =  salariuAngajat;
    }
    public void printeazaangajat(){
        System.out.println("Nume: " + nume);
        System.out.println("varsta: " + varsta);
        System.out.println("post: " + post);
        System.out.println("salariu: " + salariu);
    }
}
