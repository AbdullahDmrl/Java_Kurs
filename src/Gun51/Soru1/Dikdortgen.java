package Gun51.Soru1;

public class Dikdortgen extends Sekil{

    public Dikdortgen(int uzunluk, int genislik) {
       this.uzunluk= uzunluk;
       this.genislik=genislik;
    }

    @Override
    public double getCevre() {
        return 2*(uzunluk+genislik);
    }

    @Override
    public double getAlan() {
        return uzunluk*genislik;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +" "+" Cevre="+getCevre()+ " "+" Alan="+getAlan()+
                '}';
    }
}

