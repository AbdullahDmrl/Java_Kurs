package Gun11;

import java.util.Locale;
import java.util.Scanner;

public class _06_IfElseSor {
    public static void main(String[] args) {

        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir password giriniz=");
        String passworld=oku.nextLine();

        // ! isaretini olmayacak manasinda yaziyoruz***********
        if (passworld.length()>=8 && !passworld.toLowerCase().contains("pass") && passworld.length()<=12){

            System.out.println("dogru");
        }

        else {
            System.out.println("uygun olmayan cümle");
        }


    }
}
