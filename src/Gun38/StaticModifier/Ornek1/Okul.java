package Gun38.StaticModifier.Ornek1;

public class Okul {

    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci("Kaan","Demirel"); // oku ad degiskeni static tanimladigim icin
        Ogrenci ogr2=new Ogrenci("Musti","Demirel"); // okul ad kaldiriyorum
        Ogrenci ogr3=new Ogrenci("Apo","Demirel");

        //..........
        //........
        //........
        Ogrenci ogr500=new Ogrenci("Aycan","Demirel");

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);
        System.out.println("ogr500 = " + ogr500);
    }




}

