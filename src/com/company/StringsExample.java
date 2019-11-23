package com.company;

public class StringsExample {
    public static void main(String[] args){

        String str = "Ana are mere";//indexOf returneaza prima litere, last indexof e ultimul e
        System.out.println(str.length());//primul string este pe pozitia 0
       // System.out.println(str.substring(4,7));
        System.out.println(str.substring(str.indexOf("are"), str.indexOf("are")+3));
        System.out.println(str.substring(str.indexOf("mere"), str.indexOf("mere")+4));
        //cifra este cate litere sa iti afiseze din cuvant de la stanga la dreapta

        String st1 = "aAZz";
        String st2 = new String("aaaz");
        System.out.println(st1.compareTo(st2));// 0 sunt egale, negativ, pozitiv e mai mare mai mic

        int firstIndex = str.indexOf('e');
        int lastIndex = str.lastIndexOf('e');
        String subStr = str.substring(firstIndex + 1 , lastIndex - 1);
        System.out.println(firstIndex + 1 + subStr.indexOf('e'));
        System.out.println(str.charAt(9));


        StringBuilder builder = new StringBuilder();
        builder.append("ana ");
        builder.append("are ");
        builder.append("mere ");
        System.out.println(builder);
         builder.replace(builder.indexOf("are"), builder.indexOf("are")+3, "avea");
        System.out.println(builder);

        System.out.println(str.replace("are","avea"));
        System.out.println(str);

        String s = null;
       /* s.length();
        System.out.println(s.length());//exceptie null pointer*/
    }
}
