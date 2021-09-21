package Gun31._04_Soru;

import java.util.ArrayList;

public class Okul {
    // 1) create class student with fields: string name, int not
    // 2) Daha sonra 3 tane öğrenci ve notu oluşturun. ve bu öğrencileri bir ArrayList e ekleyin.
    // 3) Daha öğrenci bilgilerin yazdıran bir metod yazarak , Arraylist teki öğrenci bilgilerini döngü yazdırınız.
    // 4) Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak main de yazdırınız.

    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci();
        ogr1.name = "Ahmet";
        ogr1.not = 78;

        Ogrenci ogr2 = new Ogrenci();
        ogr2.name = "Aycan";
        ogr2.not = 68;

        Ogrenci ogr3 = new Ogrenci();
        ogr3.name = "Kaan";
        ogr3.not = 82;

        ArrayList<Ogrenci> ogrBilgiler = new ArrayList<>();
        ogrBilgiler.add(ogr1);
        ogrBilgiler.add(ogr2);
        ogrBilgiler.add(ogr3);

        bigiYazdirma(ogrBilgiler);

       double notOrt=notOrtalamasi(ogrBilgiler);
        System.out.println("notOrt = " + notOrt);
    }

    public static void bigiYazdirma(ArrayList<Ogrenci> ogrBilgiler) {

        for (Ogrenci ogr : ogrBilgiler) {
            System.out.println("ogr.name+\" \"+ogr.not = " + ogr.name + " " + ogr.not);
        }
    }

    public static double notOrtalamasi(ArrayList<Ogrenci> ogrBilgiler) {

        int toplam = 0;

        for (Ogrenci ogr : ogrBilgiler) {
            toplam+=ogr.not;
        }
        double notOrt=toplam/ogrBilgiler.size();
        return notOrt;
    }
}

