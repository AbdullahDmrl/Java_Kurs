package Gun16;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // girilen bir sayiya kadar (dahil) sayilarin carpimini (faktoriyel) hesaplayiniz
        // 5*4*3*2*1

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi= oku.nextInt(); // bunu döngüde kullaniyorsun
        int faktoriyel=1;

        for (int i=1;i<=sayi;i++)
        {  faktoriyel=faktoriyel*i; }
        System.out.println("faktoriyel = " + faktoriyel);




    }
}
