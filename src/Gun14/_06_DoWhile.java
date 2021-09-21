package Gun14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {

        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);
        String girilen="";

        do {
            System.out.print("Harf giriniz=");
            girilen= oku.nextLine();

            System.out.println("Program çalışıyor");

        } while (!girilen.equalsIgnoreCase("x"));

        System.out.println("Program bitti");





    }
}
