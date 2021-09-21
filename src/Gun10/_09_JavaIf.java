package Gun10;

import java.util.Scanner;

public class _09_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi=oku.nextInt();

        if (sayi%2==0){
            System.out.println("Çift");
        }

        if (sayi%2!=0){
            System.out.println("tek");
        }

    }
}
