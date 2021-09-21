package Gun14;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
        // girilen sayı dahil

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi= oku.nextInt();

        //sayi--; bu şekilde sayının kendisi işleme girmez


        while(sayi>0)
        {
            if (sayi%2==1) // tek sayilari istedigi icin
                System.out.println(sayi);

            sayi--; // 5 4 3 2 1
        }



    }
}
