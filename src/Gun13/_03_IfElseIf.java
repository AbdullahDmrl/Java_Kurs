package Gun13;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Girilen bir sayının
        // önce 100 den küçük ise, 100 den küçük yazsın
        // devamında 50 den küçük ise 50 den küçük yazsın
        // devamında 25 den küçük ise 25 den küçük yazsın.
        // mesala 10 için 3 ünüde yazacak ama 70 için sadece 1 tanesini yazacak

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz="); int sayi= oku.nextInt();


        if ( sayi < 100)
        {
            System.out.println("100 den küçük");

            if (sayi < 50) {
            System.out.println("50 den küçük");

            if (sayi < 25)
                System.out.println("25 den küçük");
        }

        }
        // alttaki seçenekte 80 girildiğinde 25 i gereksiz yere kontrol edecekti
        if ( sayi < 100)
            System.out.println("100 den küçük");

        if (sayi < 50)
            System.out.println("50 den küçük");

        if (sayi < 25)
            System.out.println("25 den küçük");

    }
}

