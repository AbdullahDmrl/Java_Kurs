package Gun10;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının 10 dan büyük ise ekrana 10 dan büyük diye yazdırınız.
        // Algoritma
        //1- Başla
        //2- Sayı oku
        //3- Sayi > 10 => "10 büyük yaz"
        //4- Dur.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz=");
        int sayi=oku.nextInt();  // 15, 5

        if (sayi > 10){ // şart sağlanıyorsa parantezlerin arasını çalıştır.değilse geç
            System.out.println("10 dan büyük");
        }
    }
}
