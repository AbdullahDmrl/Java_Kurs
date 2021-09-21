package Gun11;

import java.util.Locale;
import java.util.Scanner;

public class _05_IfElseSor {
    public static void main(String[] args) {

        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.
        // bu soruyu büyük küçük harf girilsede doğru çalışacak şekilde çözünüz.


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string giriniz=");
        String text=oku.nextLine();

        // büyük küçük harf girilsede doğru çalışacak şekilde çözünüz.
        if (text.length()>10 && text.toLowerCase().contains("study") ){

            System.out.println("evet");
        }

        else {
            System.out.println("hayir");
        }


    }

}
