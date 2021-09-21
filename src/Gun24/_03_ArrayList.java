package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class _03_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralatırken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(55);
        rakamlar.add(45);
        rakamlar.add(35);
        rakamlar.add(25);

        System.out.println("ilk hali rakamlar = " + rakamlar);

        //Sıralama yapar
        Collections.sort(rakamlar);
        System.out.println("sıralı rakamlar = " + rakamlar);

        //Tersine çevirir
        Collections.reverse(rakamlar);
        System.out.println("tersine çevirir rakamlar = " + rakamlar);

        System.out.println("list deki en büyük = " + Collections.max(rakamlar));
        System.out.println("list deki en küçük = " + Collections.min(rakamlar));

        // bütün elemanlara bir değer atama
        Collections.fill(rakamlar, 8);
        System.out.println("rakamlar = " + rakamlar);

        // belli bir değerdeki elemanları , başka bir değer atar
        Collections.replaceAll(rakamlar, 8, 9);
        System.out.println("rakamlar = " + rakamlar);



    }
}
