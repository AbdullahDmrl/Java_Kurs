package Gun31;

import java.util.Scanner;

public class _01_JavaClassAndObjekt {

    // metod bolumu
    public static void main(String[] args) {

        // Calisan kisim
        int sayi=0; // bu kisimda normalveri tanimlama (tipi ve degeri

        Scanner oku=new Scanner(System.in); //ayni bu sekilde

        //Nesne olusturma:asamali
        Araba yourCar; // burada spris var ortada araba yok
        yourCar=new Araba();
        
        // Nesne olusturma
        Araba myCar=new Araba(); // Araba cinsinden yeni bir araba olustur baslangic degerlerini kullan 
                                // burada araba uretilmis
        myCar.renk="Kirmizi";
        myCar.motorHacmi=1600;
        myCar.yili=2021;
        
        yourCar.renk="Siyah";
        yourCar.motorHacmi=2000;
        yourCar.yili=2001;

        System.out.println("myCar.renk = " + myCar.renk);
        System.out.println("myCar.motorHacmi = " + myCar.motorHacmi);
        System.out.println("myCar.yili = " + myCar.yili);
    }

    // Metod bolumu
}

// 1.Yontem
class Araba{
    //ozellikler ve metodlar
    String renk;
    int yili;
    double motorHacmi;

}