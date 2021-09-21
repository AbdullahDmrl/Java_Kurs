package Gun11;

import java.util.Scanner;

public class _07_IfElseSor {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz


        Scanner oku=new Scanner(System.in);
        System.out.print("Iki sayi giriniz=");
        String sayilar=oku.nextLine();

        int bosluk=sayilar.indexOf(" ");
        String strSay1=sayilar.substring(0,bosluk);
        String strSay2=sayilar.substring(bosluk+1);

        int sayi1=Integer.parseInt(strSay1);
        int sayi2=Integer.parseInt(strSay2);


        if (sayi1==sayi2){

            System.out.println("esit");
        }

        else {
            System.out.println("degil");
        }
    }
}
