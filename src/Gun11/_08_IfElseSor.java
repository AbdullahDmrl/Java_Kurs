package Gun11;

import java.util.Scanner;

public class _08_IfElseSor {
    public static void main(String[] args) {

        // Girilen bir sayını pozitif, begatif veya sıfır olduğunu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi = oku.nextInt();


        if (sayi > 0) {
            System.out.println("pozitif");
        }
        else {
            if (sayi < 0)
                System.out.println("negatif");
            else
                System.out.println("sifir");
        }
    }
}





