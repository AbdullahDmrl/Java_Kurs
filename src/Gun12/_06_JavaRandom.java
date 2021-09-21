package Gun12;

import java.util.Scanner;

public class _06_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz="); int ronsayi =oku.nextInt();
        int uretilenSayi=(int) (Math.random()*ronsayi); // bu kisim girilen bir sayiya kadar sayi üretme
                                                        // yani girilen bir sayiya kadar bir sayi tut gibi

        Scanner oku1=new Scanner(System.in);
        System.out.print("Tahmininizi giriniz="); int tah=oku.nextInt();

        // if ile
        if (tah==uretilenSayi) { System.out.println("Tebrikler bildiniz");}
        else { System.out.println("Bilemediniz");}

        // Ternary ile
       String sonuc=(tah==uretilenSayi) ? "Tebrikler bildiniz" : "Bilemediniz";
        System.out.println("sonuc = " + sonuc);

        System.out.println("uretilenSayi = " + uretilenSayi); // tuttugu sayi
            
        


    }
}

