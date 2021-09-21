package Gun11;

import java.util.Scanner;

public class _02_IfElseSor {
    public static void main(String[] args) {

        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize ve Final notunuz="); int vize=oku.nextInt(); int finalNot=oku.nextInt();
        double ort=(vize*0.40)+(finalNot*0.60);
        System.out.println("ort = " + ort);


        if (ort>=60){  System.out.println("Gectiniz"); }

        else { System.out.println("Kaldiniz");  }


    }
}
