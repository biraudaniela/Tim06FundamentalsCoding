package ro.sdaacademy.javafundamentals.homeTest;


class FreshJuice{
    enum FreshJuiceSize{S,M,L}
    FreshJuiceSize size;

}
public class FreshJuiceTest {
    public static void main(String[] args){
        FreshJuice suc1 = new FreshJuice();
        FreshJuice suc2 = new FreshJuice();
        suc1.size = FreshJuice.FreshJuiceSize.M;
        suc2.size = FreshJuice.FreshJuiceSize.L;
        System.out.println("Marime " + suc1.size);
        System.out.println("Marime " + suc2.size);

    }

}