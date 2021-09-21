package Gun27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _01_HashSet {
    public static void main(String[] args) {
        // tanımlandığı şekilde sabit eleman sayılı
        int sayi=5; // hafızada 1 rakam saklıyor
        int[] dizi=new int[5]; // hafızada 5 rakamlık yer ayırıyor.
        int[][] tablo=new int[5][5]; // 2D - bir tanımlamada 25 tane sayılık yer tanımladık.

        // eleman sayısına göre dinamik olarak artan veya azalabilen bir yapı gerekti.
        ArrayList<Integer> liste=new ArrayList<>(); // dinamik büyüyebilen ve küçülebilen dizi
        ArrayList< ArrayList<Integer> > listelerinListesi=new ArrayList<>(); // listelerin listesi oldu 2D

        // Bana artık tek tek eleman tutan bir liste veya dizi değişkeni yerine tekrarlı elemanlara izin vermeyen
        // bir yapı gerekiyorsa buna kümeye benzeyen set leri ornek verebiliriz

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        System.out.println("list = " + list);

        // Tekrarlara izin vermeyen eleman : HashSet
        HashSet<Integer> hs1=new HashSet<>(); // bu şekilde tanımlanıyor.
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(2);
        hs1.add(5);

        boolean eklendiMi=hs1.add(4);
        System.out.println("eklendiMi = " + eklendiMi);

        System.out.println("hs1 = " + hs1);
    }
}
