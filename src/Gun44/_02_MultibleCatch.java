package Gun44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_MultibleCatch {

    // Kullanıcıdan 5 kez 2 şer adet sayı alınız ve bölüm sonucunu ekranda gösteriniz.
    // Oluşabilecek tüm hataları try-catch ile handle ediniz.

    public static void main(String[] args) {

        //  Scanner oku = new Scanner(System.in); disarda olursa harf girislerinde sonsuz donguye girer.
        //bir kez harf girilirse surekli bgirildigini aldigi icin sonsuz donguye girer

        for (int i = 1; i <= 5; i++) {

            try {
                Scanner oku = new Scanner(System.in); // yukarida belirttigim neden den dolayi buraya aldim
                System.out.print(i+". Lutfen ilk sayiyi giriniz = ");
                int a = oku.nextInt();
                System.out.print(i+ " Lutfen ikinci sayiyi giriniz=");
                int b = oku.nextInt();
                int bolum = a / b;
                System.out.println("bolum = " + bolum);

            }
            catch (ArithmeticException ex) {
                System.out.println("Lutfen 2 sayiya 0 girmeyiniz");
                i--;  //hatali giriste sayi istamek icin

            }
            catch (InputMismatchException ex) {
                System.out.println("Lutfen sayi giriniz");
                i--;
            }
        }

    }
}





