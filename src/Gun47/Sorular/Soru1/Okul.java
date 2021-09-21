package Gun47.Sorular.Soru1;

import java.util.ArrayList;

public class Okul {
    private   String okulAd;
    private   int maxOgrenciSayisi;
    private   ArrayList<Ogrenci> ogrencileri=new ArrayList<>();


    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return ogrencileri;
    }

    public void setOgrencileri(ArrayList<Ogrenci> ogrencileri) {
        this.ogrencileri = ogrencileri;
    }

    public Okul(String okulAd, int maxOgrenciSayisi, ArrayList<Ogrenci> ogrencileri) {
        setOkulAd(okulAd);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
        setOgrencileri(ogrencileri);
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrencileri=" + ogrencileri +
                '}';
    }
}
