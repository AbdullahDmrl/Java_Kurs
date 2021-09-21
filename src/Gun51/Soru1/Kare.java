package Gun51.Soru1;

public class Kare extends Sekil{

    public Kare(int uzunluk) {
        this.uzunluk=uzunluk;
    }

    @Override
    public double getCevre() {
        return 4*uzunluk;
    }

    @Override
    public double getAlan() {
        return uzunluk*uzunluk;
    }

    @Override
    public String toString() {
        return "Kare{" +
                "uzunluk=" + uzunluk +" "+" Cevre="+getCevre()+ " "+" Alan="+getAlan()+
                '}';
    }
}
