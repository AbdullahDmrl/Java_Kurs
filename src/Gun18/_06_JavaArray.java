package Gun18;

import java.util.Scanner;

public class _06_JavaArray {
    public static void main(String[] args) {

        // 5 elamanli bir dizi tanimlayiniz, 10 a kadar olan sayilardan random atayarak
        // sonra ayri bir döngü yazdiriniz

        int[] dizi=new int[5];
        String sayi=""; // sayiyi görmek icin ben yazdim

      for (int i=0;i<dizi.length;i++)
        {
           dizi[i]=(int)(Math.random()*10);

           sayi=sayi+dizi[i];
        }
        System.out.println("sayi = " + sayi);

        for (int i=0;i<dizi.length;i++)

            System.out.println("dizi["+i+"] ="+ dizi[i]);

    }
}
