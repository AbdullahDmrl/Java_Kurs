package Gun16;

import java.util.Scanner;

public class _09_Continue {
    public static void main(String[] args) {
        // kulnanicidan 5 adet sayi isteyiniz
        // bu sayilardan 5 ile 10 arasindakiler haric, digerlerinin toplamini bulunuz
        // bu soruyu continue kullanarak cozunuz

        Scanner oku=new Scanner(System.in);

        int toplam=0;
       for(int i=1; i<=5;i++)
       {
           System.out.print("Bir sayi giriniz=");
           int sayi=oku.nextInt();
           if (sayi>5 && sayi<10)
           {  System.out.println("Bu sayi 5 ile 10 arasinda oldugundan toplanmayacak="+sayi);
           continue;
           }

           toplam=toplam+sayi;
       }

        System.out.println("toplam = " + toplam);







    }
}
