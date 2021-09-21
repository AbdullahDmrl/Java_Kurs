package Gun13;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B harflerini kullanarak
        // isteğe uygun olan işlemi yaptırıp sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Iki tam sayi giriniz=");
        int tamSay1= oku.nextInt(); int tamsay2= oku.nextInt();

        System.out.println("Toplam T\nÇıkartma Ç\nÇarpma P\nBölme B\nGiriniz. ");
        Scanner okuStr = new Scanner(System.in);
        String islem=okuStr.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam = " + (tamSay1+tamsay2));
        else
        if (islem.equalsIgnoreCase("Ç"))
            System.out.println("Çıkartma = " + (tamSay1-tamsay2));
        else
        if (islem.equalsIgnoreCase("P"))
            System.out.println("Çarpma = " + (tamSay1*tamsay2));
        else
        if (islem.equalsIgnoreCase("B"))
            System.out.println("Bölme = " + (tamSay1/tamsay2));

    }
}
