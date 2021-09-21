package Gun14;

import java.util.Scanner;

public class _05_DoWhile {
    public static void main(String[] args) {

        // Kullanıcıdan Sıfır girilene kadar sayı isteyiniz.
        // bu soruyu önce while ile çözünüz.Sonra do-While

     /*   Scanner oku=new Scanner(System.in);
        int sayi=0; //

        while(sayi!=0)
        {
            System.out.print("Sayı giriniz=");
            sayi = oku.nextInt();
        }

      */

        // yukaridaki selde donguye giremedigi icin donguye bir kereligine baslayabilmesi icin Do while yapmislar

        Scanner oku=new Scanner(System.in);
        int sayi; // burada deger atamak zorunda degiliz atasakta degismez int sayi=0; calisir

        // normal while dan farkı döngüye mutlaka 1 kez girer, şart sonda kontrol edilir
        // şart sağlanıyorsa döngü devam eder.
        do{

            System.out.print("Sayı giriniz=");
            sayi = oku.nextInt();

        }while(sayi !=0 ); // do_wile döngüsü


    }
}
