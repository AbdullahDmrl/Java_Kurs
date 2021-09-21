package Gun14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
        // TODO: ödev: burada hep - sayı girilirse sonuç ne olur, düzeltmek için ne yapmalısınız.

        Scanner oku=new Scanner(System.in);

        int sayac=0;
        int enb=0;

        while(sayac<5)
        {
            System.out.print("Sayı giriniz=");
            int sayi = oku.nextInt();

        //  if (sayi > enb)
        // enb=sayi;

            enb=Math.max(enb, sayi); // yukarıdaki if li yapıya karşılık kullanılabilir.

            sayac++;
        }

        System.out.println("enb = " + enb);



    }
}
