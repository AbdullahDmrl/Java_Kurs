package Gun52.Soru2;

public class Ogrenci extends Kisi {
    private double ucret;

    public Ogrenci(String isim, String adres, Okul okul, double ucret) {
        super(isim, adres,okul, UyeTipi.OGRENCI);
        setUcret(ucret);
    }

    public double getUcret() {
        return ucret;
    }
    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return super.toString()+" Ucret="+getUcret();
    }
}
