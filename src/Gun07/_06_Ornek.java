package Gun07;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Birinci Sayi="); int sayi1=oku.nextInt();
        System.out.print("İkinci Sayi="); int sayi2=oku.nextInt();

        // 1.yöntem
        int toplam=sayi1+sayi2;
        System.out.println("1 Toplam = " + toplam);

        // 2.yöntem
        System.out.println("2 Toplam="+ (sayi1+sayi2));

        //çalışmayan yöntem
        System.out.println("3 Toplam="+ sayi1 + sayi2); // rakamları yan yana string olarak toplar
        // burada string le sayı toplandığından
        // println hepsini stringe çevirip yanyana ekler , sayı toplaması yapmaz
    }
}
