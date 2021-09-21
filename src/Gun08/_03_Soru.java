package Gun08;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin sadece son harfini yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("Bir string giriniz=");
        String girilen= oku.nextLine();

        //   01234567890
        //   ismet temur, önce uzunluğu(11) bulursun, charAt(uzunluk)
        int uzunluk = girilen.length();
        char sonHarf= girilen.charAt(uzunluk-1); // Toplam karakter sayısı, sayma sayısı ile 11
        // fakat karakterlerin sıra numarası (index) ise 0 dan başlar.
        System.out.println("sonHarf = " + sonHarf);
    }
}
