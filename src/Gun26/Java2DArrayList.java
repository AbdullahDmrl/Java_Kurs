package Gun26;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2DArrayList {
    public static void main(String[] args) {
        /*******************/
        int sayi = 5; // tek bir rakam saklayabilen değişken
        int[] dizi = new int[5]; // 5 adet rakam saklayabilen değişken.
        int[][] tablo = new int[5][5]; // 5x5 lik 25 adet rakam saklayabilen değişken

        ArrayList<Integer> liste = new ArrayList<>(); // istenildiği kadar rakam eklenebilen değişken
        /*******************/

        int[][] tablo2 = new int[5][5]; //5x5 lik 25 adet rakam saklayabilen değişken

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); // Listelerin listesi
        // her bir eleman liste

        String[] dersler = new String[3];
        dersler[0] = "Matematik";
        dersler[1] = "Türkçe";
        dersler[2] = "Kimya";

        ArrayList<Integer> matNotlar = new ArrayList<>(); // bu bir liste
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>(); // bu bir liste
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>(); // bu bir liste
        kimNotlar.add(60);
        kimNotlar.add(50);
        kimNotlar.add(40);
        kimNotlar.add(30);

        notlarListesi.add(matNotlar);
        notlarListesi.add(turNotlar);
        notlarListesi.add(kimNotlar);


        for (int i = 0; i < matNotlar.size(); i++) {
            System.out.println("matNotlar = " + matNotlar.get(i));
        }

        // tüm notlar
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println(dersler[i]);
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.println((i + 1) + ".yapraktaki, " + (j + 1) + ".Not = " +
                        notlarListesi.get(i).get(j));  //satır sütun yapısı tablo[i][j]
            }
        }

        //Soru 1: Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini bir fonksiyonda
        //        yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("DersNo (0-Mat, 1-Tur, 2- Kim) :");
        int dersNo = oku.nextInt();

        dersNotlariYazdir(notlarListesi, dersNo);

        //Soru 2 : Yukarıda Girilen Derse ait ortalamayı main de yazdırınız.
        int dersOrt = dersOrtalamaBul(notlarListesi, dersNo);
        System.out.println("dersOrt = " + dersOrt);

        //Soru 3 : Tüm Derslerin Not ortalamasını(double) mainde yazdırınız.
        double tumDersOrt = tumDersOrtBul(notlarListesi);
        System.out.println("tumDersOrt = " + tumDersOrt);

        //Soru 4 : Kullacıdan alacağınız sıradaki tüm derslerin notlarının ortalamasını bulunuz
        // yani tüm derslerdeki 1.Sınavın ortalaması gibi, sınav bilgisini kullanıcıdan alınız
        System.out.print("sinavNo :");
        int sinavNo = oku.nextInt();
        double sinavOrt = sinavOrtBul(notlarListesi, sinavNo);
        System.out.println("sinavOrt = " + sinavOrt);

        // 1.Ödev
        // En büyük ve en küçük elemanı bulunuz
        
        int enBuy=enBuyuk(notlarListesi);
        System.out.println("enBuy = " + enBuy);
        int enKuc=enKuc(notlarListesi);
        System.out.println("enKuc = " + enKuc);
        // 2.Ödev
        // Recursive (ÖzYinelemeli Metodlar) konusu google dan ve youtube dan araştırılacak ve öğrenilecek.

        // 3.Ödev
        // `"aaabbccccdeeeff" seklinde verilen bir stringi yine string olarak "3a2b4c1d3e2f"
        //  seklinde yazdiran methodu yapiniz. parametre string

        String text="aaabbccccdeeeff";

        kelimeSayilar(text);
    }
    public static void kelimeSayilar(String text){
        int counter=0;
        int index=0;
        for (int i = 0; i < text.length(); i++)
        { for (int j = 0; j < text.length(); j++)
            {if (text.charAt(i)==text.charAt(j))
                    counter++;  }
            index=index+counter;
            i=index-1;
            System.out.print(counter+text.substring(index-1,index));
            counter=0; }
    }

    public static int enBuyuk(ArrayList<ArrayList<Integer>> notlarListesi) {
        int max=notlarListesi.get(0).get(0);
        for (int i = 0; i <notlarListesi.size() ; i++) {
            for (int j = 0; j <notlarListesi.get(i).size() ; j++) {
                max=Math.max(max,notlarListesi.get(i).get(j));  }   }
        return max;   }
    public static int enKuc(ArrayList<ArrayList<Integer>> notlarListesi) {
        int min=notlarListesi.get(0).get(0);
        for (int i = 0; i <notlarListesi.size() ; i++) {
            for (int j = 0; j <notlarListesi.get(i).size() ; j++) {
                min=Math.min(min,notlarListesi.get(i).get(j));   }    }
          return min;  }

    public static double sinavOrtBul(ArrayList<ArrayList<Integer>> notlarListesi, int sinavNo) {
        double toplam = 0;
        int notMiktari = 0;

        for (int i = 0; i < notlarListesi.size(); i++) {
            if (sinavNo < notlarListesi.get(i).size()) { // sıradaki listedeki not sayısı istenen sınav nodan büyük ise
                toplam += notlarListesi.get(i).get(sinavNo);
                notMiktari++;
            }
        }

        return toplam / notMiktari;
    }

    public static double tumDersOrtBul(ArrayList<ArrayList<Integer>> notlarListesi) {
        double toplam = 0;
        int notMiktari = 0;

        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                toplam = toplam + notlarListesi.get(i).get(j);
                notMiktari++;
            }
        }

        return toplam / notMiktari;
    }


    public static int dersOrtalamaBul(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {
        int toplam = 0;

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam += notlarListesi.get(dersNo).get(i);
        }

        return toplam / notlarListesi.get(dersNo).size();
    }

    public static void dersNotlariYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {
        System.out.println(notlarListesi.get(dersNo));
    }
}