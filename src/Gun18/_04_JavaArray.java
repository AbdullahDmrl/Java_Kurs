package Gun18;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {

        // 5 elamanli int bir dizi tanimlayiniz.
        // Kullanicidan degerleri olaral, bu diziyi doldurunuz.
        // Ortalamadan buyuk elaman sayisini bulun

        int[] dizi=new int[5];

        Scanner oku=new Scanner(System.in);
        int toplam=0;

        for (int i=0;i<dizi.length;i++)
        {
            System.out.print((i+1)+".sayi=");
            dizi[i]=oku.nextInt();
            toplam=toplam+dizi[i];
        }

        int ort=toplam/dizi.length;
        int ortBuyukSayi=0;

        for (int i=0;i<dizi.length;i++)
        {
            if (dizi[i]>ort)
                ortBuyukSayi++;

        }

        System.out.println("ortBuyukSayi = " + ortBuyukSayi);








    }
}
