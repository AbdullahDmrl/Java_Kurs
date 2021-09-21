package Gun16;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanicanin girecegi bir rakama kadar sayilarin toplamini yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi= oku.nextInt(); // döngüde kullanacaksin

        int toplam=0;

        for(int i=1;i<sayi;i++)
        { toplam=toplam+i; }
        System.out.println("toplam = " + toplam);


    }
}
