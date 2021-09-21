package Gun11;

import java.util.Scanner;

public class _03_IfElseSor {
    public static void main(String[] args) {
    // Girilen bir sayinin tek mi cift mi oldugunu yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi=oku.nextInt();


        if (sayi%2==0){
            System.out.println("Cift");
        }

        else {
            System.out.println("Tek");
        }

    }
}
