package Gun52.Soru2;

import java.util.ArrayList;

public class Okul {
    private String ismi;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrenciler=new ArrayList<>();
    private ArrayList<Calisan> calisanlar=new ArrayList<>();

    public Okul(String ismi, int maxOgrenciSayisi) {
        this.ismi = ismi;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public void calisanEkle(Calisan cal) {
        calisanlar.add(cal);
   }
    public void calisanListele() {
        for (Calisan cal:calisanlar){

            System.out.println(cal);
        }
    }

    public void ogrenciKayit(Ogrenci ogr) {
        ogrenciler.add(ogr);
    }
    public void ogrenciListele() {
        for (Ogrenci ogr:ogrenciler){

            System.out.println(ogr);
        }
    }

    @Override
    public String toString() {
        return ismi + '\'' +
                ", maxOdrenciSayisi=" + maxOgrenciSayisi;    }
}
