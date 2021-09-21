package Gun49.Ornrk3;

public class GenelMudur extends Calisan{
    double tazminat;

    public GenelMudur(String isim, double maas, int maasKatSayisi, double tazminat) {
        super(isim, maas, maasKatSayisi);
        this.tazminat=tazminat;  // eskisinin uzerine yeni fields ekleme
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+tazminat;  // burada tazminati ekledik
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+tazminat;  // bunuda toString yaparsak
                                                // override i override yapacagiz,istedigimizi ilave edecegiz
    }
}
