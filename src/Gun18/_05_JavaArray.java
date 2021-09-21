package Gun18;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {

        // Kullaniocidan alacaginiz 7 sayiyi bir diziye atadiktan sonra
        // ayri bir döngü ile kac tanesinin tek oldugunu bulunuz

        int[] dizi=new int[7];

        Scanner oku=new Scanner(System.in);


        for (int i=0;i<dizi.length;i++)
        {
            System.out.print((i+1)+".sayi=");
            dizi[i]=oku.nextInt();
        }

        int tekSayilar=0;

        for (int i=0;i<dizi.length;i++)
        {
          if (Math.abs(dizi[i])%2==1)                                     //if (dizi[i]%2==1)
                tekSayilar++;

        }

        System.out.println("tekSayilar = " + tekSayilar);

    }
}
