package Gun54.Soru;

public class Dikdortgen implements ISekil{
    @Override
    public double Cevre(int... dizi) {
        return 2*(dizi[0]+dizi[1]);
    }

    @Override
    public double Alan(int... dizi) {
        return dizi[0]*dizi[1];
    }
}
