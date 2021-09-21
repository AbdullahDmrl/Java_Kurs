package Gun07;

import java.util.Scanner;

public class _02_JavaScanner {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        // oku ismine bir okuyucu tanımlandı, (System.in)klavyeden giriş yapmak üzere
        System.out.print("Bir sayı giriniz=");
        int sayi=oku.nextInt();
        // oku.nextInt() ekrandan sayıyı aldı ve bizde sayi değikenine attık

        System.out.println("Girilen sayi = " + sayi);
    }
}
