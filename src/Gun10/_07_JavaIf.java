package Gun10;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz=");
        int sayi=oku.nextInt();

        if (sayi == 0) {
            System.out.println("Sayı sıfırdır");
        }

        if (sayi > 0) {
            System.out.println("Sayı pozitif");
        }

        if (sayi < 0) {
            System.out.println("Sayı negatif");
        }
    }
}
