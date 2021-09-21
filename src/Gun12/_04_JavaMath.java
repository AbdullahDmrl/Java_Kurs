package Gun12;

import java.util.Scanner;

public class _04_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Uc sayi giriniz=");
        int say1= oku.nextInt(); int say2= oku.nextInt(); int say3= oku.nextInt();

        int sonuc=Math.max(say1,Math.max(say2,say3));
        System.out.println("sonuc = " + sonuc);


    }
}
