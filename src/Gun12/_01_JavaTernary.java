package Gun12;

import java.util.Scanner;

public class _01_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        // tek ie "tek" atayınız ve ekrana stringi yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi = oku.nextInt();
        String text = "";

        // Klasik yontem
        if (sayi % 2 == 0) text="Cift";
        else text="Tek";
        System.out.println("String = " + text);

        // Ternary yontemi
        text=(sayi%2==0) ? "CIFT" : "TEK";
        System.out.println("Ternary = " + text);

        // yada direkt
        System.out.println("Ternary = " + ((sayi%2==0) ? "CIFT" : "TEK"));


    }
}
