package Gun22;

import java.util.Arrays;
import java.util.Scanner;

public class _04_javaMethod {
    public static void main(String[] args) {


        // String şeklinde aralarında boşluklarla girilen bir dizinin
        // enbüyük, enküçük elemanını, bütün elemanların toplamını,
        // sayıların ortalamasını ayrı ayrı metodlarda yapınız.
        // 3 4 12 45 67  gibi giriş yapılacak.

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayilari birer bosluk ile giriniz");
        String cumleDizi= oku.nextLine();



        String[] strDizi=cumleDizi.split(" ");
        int[] intDizi=new int[strDizi.length];

        for (int i=0;i< strDizi.length;i++)
        {
            intDizi[i]=Integer.parseInt(strDizi[i]);


        }
        System.out.println(Arrays.toString(intDizi));



        enBuyuk(intDizi);
        enKucuk(intDizi);
        tumToplam(intDizi);
        ortalama(intDizi);
    }
    public static void enBuyuk(int dizi[])
    {
        Arrays.sort(dizi);
        System.out.println("enbuyuk="+dizi[dizi.length-1]); }

    public static void enKucuk(int dizi[])
    {
        Arrays.sort(dizi);
        System.out.println("enkucuk="+dizi[0]); }

    public static void tumToplam(int dizi[]) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++)
            toplam += dizi[i];

        System.out.println("toplam = " + toplam);
    }
    public static void ortalama(int dizi[])
    {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++)
            toplam += dizi[i];
        System.out.println("Ortalama = " + toplam/ dizi.length);}



    }




