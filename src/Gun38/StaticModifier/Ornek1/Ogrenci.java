package Gun38.StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyAd;
   // static String okulAd; // onceki halinde hepsinde okul ad ayni oldugu icin
                            // hafizada 500 defa yer kapliyordu. bunun onune gecmek icin degiskeni static tanimladik
    static String getOkulAd="Adana Lisesi"; // bu sekilde de yazabiliriz tekrar tekrar hifizada ki yere atamayi onleriz

    public Ogrenci(String ad, String soyAd) { // static tanimladigim icin okul ad kadiriyorum
        this.ad = ad;
        this.soyAd = soyAd;
       // this.okulAd = "Adana Lisesi"; bu durumda bunu kaldiririz
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", okulAd='" + Ogrenci.getOkulAd + '\'' +  // son haliyle ciktiyida degistirmem lazim
                '}';
    }
}
