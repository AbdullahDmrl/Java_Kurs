package Gun11;

import java.util.Scanner;

public class _04_IfElseSor {
    public static void main(String[] args) {

        // girilen bir stringin uzunlugu 10 dan buyuk ve icinde "study" kelimesi geciyorsa
        // ekrana evet degilse hayir yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string giriniz=");
        String text=oku.nextLine();


        if (text.length()>10 && text.contains("study")){
            System.out.println("evet");
        }

        else {
            System.out.println("hayir");
        }


    }
}
