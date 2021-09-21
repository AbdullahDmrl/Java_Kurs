package Gun14;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayıların toplamını bularak yazdırınız.
        // girilen sayı dahil

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi= oku.nextInt();
        int yedekSay=sayi; //sayaclinin calismasi icin yaptik

        int toplam=0;

        while (sayi>0)
        {
        toplam=toplam+sayi; // 5 9 12 14 15
        sayi--;// 5 4 3 2 1

            // toplam = toplam + sayi--; // yukarıdaki 2 satırın yerine bu hem de ne güzel olur.
        }
        System.out.println("toplam = " + toplam);

        // sayaclı halinde sayi olrak girersek  toplam 0 verir cunku sayi yukarida sayi sifirlaniyor
        // Ikisininde celismasi icin yedek sayi tanimladik
        int sayac=0;
        toplam = 0;
        while(sayac <= yedekSay)
        {
            toplam=toplam+sayac; // 0,1,2,3,4,5
            sayac++;
        }

        System.out.println("toplam = " + toplam);

    }
}
