package Gun47.Ornekler.Ornek1;

public class Kisi {

    String ad;
    String soyAd;
    private int yas;

    // değişkene direk erişimi kapatıp
    // bir metod ile korumalı setleme işlemine
    // Encapsulation denir.
    // setter metod


  public void setYas(int yas) {

        this.yas =Math.abs(yas);
    }
    // getter metod
    public int getYas() {
        return yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                '}';
    }
}
