package Gun54.Soru;

public class Kare implements ISekil {

    @Override
    public double Cevre(int... dizi) {
        return 4*dizi[0];
    }

    @Override
    public double Alan(int... dizi) {
        return dizi[0]*dizi[0];
    }
}
