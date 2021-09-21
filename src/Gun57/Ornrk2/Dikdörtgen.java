package Gun57.Ornrk2;

public class Dikdörtgen extends Sekil{

    private double uzunluk;
    private double genislik;

    public Dikdörtgen(double uzunluk,double genislik){ //nesne olustururken bu degerlere erisbilmem icin
                                                        // consructer veya setter kullanmam gerekir
        //super();
        this.uzunluk=uzunluk;
        this.genislik=genislik;
    }


    @Override
    double Alan() {
        return uzunluk*genislik;
    }

    @Override
    double Cevre() {
        return 2*(uzunluk+genislik);
    }
}
