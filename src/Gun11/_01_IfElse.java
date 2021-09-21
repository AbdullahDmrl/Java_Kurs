package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Notunuzu giriniz=");
        int ogrNot=oku.nextInt();


        if (ogrNot>=50){System.out.println("Gectiniz"); }
        if (ogrNot<50){ System.out.println("Kaldiniz");  }

        // yada daha hizli
        // if sarti calismadiginda direk Else e gecer
        if (ogrNot>=50){  System.out.println("Gectiniz"); }

        else { System.out.println("Kaldiniz");  }
} }
