package Gun07;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Girilen bir adı ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Lütfen adınızı giriniz=");
        String ad= oku.next(); // next() -> kelime okumak için

        System.out.println("ad = " + ad);
    }
}
