package Gun13;

import java.util.Locale;
import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.(switch kullanınız)

        Scanner oku=new Scanner(System.in);
        System.out.print("Iki tam sayi giriniz=");
        int tamSay1= oku.nextInt();int tamSay2= oku.nextInt();

        Scanner oku2=new Scanner(System.in);
        System.out.print("Toplam için T\nÇıkrma için C\nÇarpma için P\nBölme için B ye\n basınız.");
        String basTus=oku2.nextLine();

        switch (basTus.toLowerCase()) {  // kucuk harfe basarsa calissin diye

            case "T" :
                System.out.println("sonuc = " + (tamSay1+tamSay2));
                break;
            case "C":
                System.out.println("sonuc = " + (tamSay1-tamSay2));
                break;
            case "P" :
                System.out.println("sonuc = " + (tamSay1*tamSay2));
                break;
            case "B":
                System.out.println("sonuc = " + (tamSay1/tamSay2));
                break;
            default:
                System.out.println("Hatali tus");



        }
    }
}
