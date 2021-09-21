package Gun13;

import java.util.Scanner;

public class _01_JavaElseIf {
    public static void main(String[] args) {
        // Bir otopark ücret hesaplama programı yapılmak isteniyor.
        // 0-2 saat ara 5 €, 2-5 arası 10 € , 5 saatten sonra 15 € olarak
        // saat girildiğinde ücreti yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Saat giriniz=");
        int saat= oku.nextInt();

        if (saat<02)
            System.out.println("ucret = " + "5€ ");
        else
            if (saat<=5)
                System.out.println("ucret= " + "10€  ");
            else
                System.out.println("ucret = " + "15€ ");
        // Tercih edilmeyen yontem cunku hepsini kontrol eder

        if (saat<=2)
            System.out.println("ucret = " + "5€ ");
        if (saat>2 && saat<=5)
            System.out.println("ucret = " + "10€ ");
        if (saat>5)
            System.out.println("ucret = " + "15€ ");

        /// Ternary ile. genelde iki secenekliler icin kullanilir
        String ucret= saat<=2 ? "5 €" : (saat <= 5 ? "10 €" :  "15 €") ;

        System.out.println("ucret = " + ucret);
    }
}
