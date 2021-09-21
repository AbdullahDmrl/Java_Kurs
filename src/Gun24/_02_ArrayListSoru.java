package Gun24;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayListSoru {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        ArrayList<Integer> notlar=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        Scanner oku=new Scanner(System.in);
        String DevamMi;
        do {
            System.out.print("Notu giriniz=");
            int score=scan.nextInt();
            notlar.add(score);

            System.out.print("Devam etmek istermisiniz=  E/H");
            DevamMi=oku.next();
        }while (DevamMi.equalsIgnoreCase("E"));

        int toplam=0;

        for (int i = 0; i < notlar.size(); i++) {
            toplam+=notlar.get(i);
        }
        int ort=toplam/notlar.size();

        int ortGecenOgSay=0;

        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>ort)
                ortGecenOgSay++;
        }
        System.out.println("toplam = " + toplam);
        System.out.println("ort = " + ort);
        System.out.println("ortGecenOgSay = " + ortGecenOgSay);
    }
}
