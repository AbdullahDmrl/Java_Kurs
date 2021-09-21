package Gun12;

import java.util.Scanner;

public class _07_JavaRandom {
    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri isteyerek random sayı üretiniz: Bunun disinda hep sifirdan baslar
        // ve üretilen sayıyı ekrana yazdırınız.
        // (int) (Math.random() * ((max - min) + 1)) + min; Alt üst deger formülü

       Scanner oku=new Scanner(System.in);
       System.out.print("Min Deger giriniz="); int minDeger= oku.nextInt();
       System.out.print("Max deger giriniz="); int maxDeger= oku.nextInt();

       int uretilenDeger=(int) (Math.random() * ((maxDeger - minDeger) + 1)) + minDeger;

        System.out.println("uretilenDeger = " + uretilenDeger);


    }
}
