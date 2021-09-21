package Gun47.Sorular.Soru1;

public class Ogrenci {
    private int okulNo;
    private   String ad;
    private   String soyad;
    private   int yas;
    private static int ID=1;

    public Ogrenci(String ad, String soyad, int yas)  {
        setokulNo(yas);
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas)  {   if (yas>15)
        throw new RuntimeException("Ogrenci yas siniri 15 dir");
    else
        this.yas = yas;
    }
    public int getokulNo() {
        return ID;
    }

    private void setokulNo(int yas) {
        if (yas>15)
            throw new RuntimeException("ID artmadi");
        else
            this.okulNo = ID++;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "Okul no='" + okulNo+ '\'' +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
