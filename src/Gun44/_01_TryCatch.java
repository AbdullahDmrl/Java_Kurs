package Gun44;

import java.util.Scanner;

public class _01_TryCatch {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        try {// hatanın olma ihtimalinin olduğu kodlar bu bloğa alınır

            System.out.print("1.Sayı giriniz=");
            int sayi1 = oku.nextInt();

            System.out.print("2.Sayı giriniz=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

        }
        catch (Exception hata)// hata olduğunda çalışacak bölüm
        {
            System.out.println("Hata oldu");
            System.out.println("Hata mesajı="+ hata.getMessage());
            hata.printStackTrace(); //  hatanin altindaki bolumu alir
        }
    }


}
