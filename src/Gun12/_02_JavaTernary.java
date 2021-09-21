package Gun12;

import java.util.Scanner;

public class _02_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Girilen sayı 50 den büyük ise buyuk , değilse kucuk  ekrana yazdırınız.
        // Ternary operatör ile yapınız.

       Scanner oku=new Scanner(System.in);
       System.out.print("Bir sayi giriniz="); int sayi= oku.nextInt();

       int sonuc=(sayi>50) ? 1 : 0; // burada sayi olarak istedigi icin int sonuc tanimladim
        System.out.println("sonuc = " + sonuc);

        System.out.println("sonuc = " + ((sayi>50) ? 1 : 0)); // kisa yol


        System.out.println();

        // Girilen sayı 50 den büyük ise buyuk , değilse kucuk  ekrana yazdırınız.

        String text=""; // text istedigi icin String tanimladim

        text=(sayi>50) ? "Buyuk" : "Kucuk";  // Uzun yol
        System.out.println("text = " + text);

        System.out.println("text = " + (sayi>50 ? "Buyuk" : "Kucuk"));  // Kisa yol
    }
}
