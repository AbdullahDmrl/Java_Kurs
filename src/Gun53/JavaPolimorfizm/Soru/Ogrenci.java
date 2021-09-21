package Gun53.JavaPolimorfizm.Soru;

public class Ogrenci extends Kisi {

    private String subesi;

    public Ogrenci(String ad, String soyad, String görevi,String subesi) {
        super(ad, soyad, görevi);
        this.subesi=subesi;
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }
}
