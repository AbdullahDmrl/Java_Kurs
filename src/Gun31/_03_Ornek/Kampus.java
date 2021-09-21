package Gun31._03_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // okul ve ogrenci siniflari olan yapi tasarla

        Ogrenci ogr1=new Ogrenci();
        ogr1.num=1;
        ogr1.nama="Ali";
        ogr1.sirName="Kus";

        Ogrenci ogr2=new Ogrenci();
        ogr2.num=2;
        ogr2.nama="Veli";
        ogr2.sirName="Deli";

        Okul okul1=new Okul();
      okul1.isim="Baspinar Okulu";
      okul1.adres="Baspinar Turkey";
      okul1.mudur="Hamza Arik";
      okul1.ucret=1000;

        System.out.println("ogr1 = " + ogr1.num);
        System.out.println("ogr1 = " + ogr1.nama);
        System.out.println("ogr1 = " + ogr1.sirName);

        System.out.println("okul1.isim = " + okul1.isim);
        System.out.println("okul1.mudur = " + okul1.mudur);
        System.out.println("okul1 = " + okul1.adres);
        System.out.println("okul1.ucret = " + okul1.ucret);

        ogr1.okulu=okul1;   // Okul ekleme 1 yontem
        System.out.println("ogr1 = " + ogr1.okulu.isim);
        System.out.println("ogr1 = " + ogr1.okulu.adres);

        ogr2.okulu=new Okul();  // Okul ekleme 2 yontem
        ogr2.okulu.mudur="Aycan";
        ogr2.okulu.ucret=300000;

        System.out.println("ogr2 = " + ogr2.okulu.ucret);
    }

}
