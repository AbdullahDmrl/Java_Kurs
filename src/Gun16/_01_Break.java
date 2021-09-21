package Gun16;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {

        // Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true  değilse false yazdırınız.
        // 16 -> evet,  5 -> hayır

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi = oku.nextInt();

        int sayac = 1;
        int arananSayi = 0;

        while (sayac < sayi) // 1 ,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
        {
            if (sayac * sayac == sayi) {
                arananSayi = sayac;
                break; // çalıştığında döngüyü keser, kırar
            }
            sayac++;
        }

        if (arananSayi > 0)
            System.out.println("true");
        else
            System.out.println("false");

        System.out.println("arananSayi = " + arananSayi);

        System.out.println();
        // for ile cozumu  /////////////////////////////////////

        int tamSayi =0;
        int aranaSayi=0;

        for (int i =1; i <= sayi; i++) {

            tamSayi =i*i;

            if (tamSayi == sayi) {
                aranaSayi=i;
                System.out.println("Tam kare sayidir");break;
            }
        }

        if (aranaSayi> 0)
            System.out.println("true");
        else
            System.out.println("false");

        System.out.println("arananSayi = " + aranaSayi);





    }
}