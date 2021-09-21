package Gun10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız, eşit ise eşit yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1.Sayiyi giriniz=");
        int sayi1=oku.nextInt();
        System.out.print("2.Sayiyi giriniz=");
        int sayi2=oku.nextInt();

        if (sayi1>sayi2){
            System.out.println("Sayi 1 büyüktür ="+ sayi1);
        }

        if (sayi2>sayi1){
            System.out.println("Sayi 2 büyüktür ="+sayi2);
        }

        if (sayi1==sayi2){
            System.out.println("Eşittir");
        }

    }
}
