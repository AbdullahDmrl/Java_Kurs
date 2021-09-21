package Gun53.JavaPolimorfizm.Soru;

public class Kisi {

  private   String ad;
  private   String soyad;
  private   String görevi;

    public Kisi(String ad, String soyad, String görevi) {
        this.ad = ad;
        this.soyad = soyad;
        this.görevi = görevi;
    }



    public static void kimlikYaz(Kisi kisi)
    {
        System.out.println("Kisi.ad = " + kisi.ad);
        System.out.println("Kisi.soyad = " + kisi.soyad);
        System.out.println("Kisi.gorev = " + kisi.görevi);

        // gelene öğrenci ise
        if (kisi instanceof Ogrenci)
          System.out.println("Subesi = " + ((Ogrenci)kisi).getSubesi());

        // gelen calisan ise
        if (kisi instanceof Calisan)
           System.out.println("Deparmani = " + ((Calisan)kisi).getDepartmani());
    }



}
