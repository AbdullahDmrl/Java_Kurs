package Gun54.Soru;

public class Cember implements ISekil{


    @Override
    public double Cevre(int... dizi) {
        return 2*Math.PI*dizi[0];
    }

    @Override
    public double Alan(int... dizi) {
        return Math.PI*dizi[0]*dizi[0];
    }
}
