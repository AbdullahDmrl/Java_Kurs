package Gun16;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker alt alta olacak sehilde yazdiriniz
        // bosluklari yazmasin

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string yaziniz=");
        String cumle= oku.nextLine();
        System.out.print(cumle);

        for (int i=0; i<cumle.length();i++)
        {
            if (cumle.charAt(i)==' ')
                continue; // continue calistigi zaman devam eden satirlar pas gecilir ve sonraki adimdan devam edilir
            System.out.print(cumle.charAt(i));
        }

        for (int i1=0; i1<cumle.length();i1++)
        {
            if (cumle.charAt(i1)!=' ')

            {System.out.println(cumle.charAt(i1));} // alt alta yazar
        }


    }
}
