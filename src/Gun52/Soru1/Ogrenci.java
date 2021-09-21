package Gun52.Soru1;

public class Ogrenci {

    private    int ID;
    private    String isim;
     private   String tipi;
     private   static int sayacID=1;

    public Ogrenci(String isim, String tipi) {
        this.ID = sayacID++;
        this.isim = isim;
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ID=" + ID +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
