package Gun32._03_Ornek;

public class ElektrikHesabi {
    int toplamTuketim;
    double oran;
    double fatura;

    public void tuketimEkle(int tuketim)
    {
        toplamTuketim += tuketim;
    }

    public double odenecekTutar()
    {
        oran=0.7;
        fatura = (oran*toplamTuketim);
        return fatura;
    }

}
