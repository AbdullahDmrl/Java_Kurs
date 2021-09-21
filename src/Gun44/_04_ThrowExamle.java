package Gun44;

import java.util.Scanner;

public class _04_ThrowExamle {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Kullanici adi giriniz = ");
        String userName = oku.nextLine();

        if (userName.length()<6)

            System.out.println("Kullanici adi 6 harften kucuk olamaz");

        if (userName.length()>10)

            System.out.println("Kullanici adi 10 harften buyuk olamaz");

    }
}
