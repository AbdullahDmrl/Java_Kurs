package Gun33._03_Soru;

import java.util.ArrayList;

public class Student {

    String name;
    int maxCredit = 10;
    ArrayList<Lesson> derslerListesi;
    int toplamKredi=0;

    public void dersEkle(Lesson ders) {

        toplamKredi+= ders.credit;

       if (toplamKredi< maxCredit)
       { derslerListesi.add(ders);
       System.out.println(ders.name + " " + ders.credit); }

        if (toplamKredi>maxCredit)
       {  System.out.println("Alabileceğiniz max credi doldu");}

    }
}





