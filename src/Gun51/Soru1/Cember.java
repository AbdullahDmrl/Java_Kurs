package Gun51.Soru1;

public class Cember extends Sekil {

    public Cember(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getCevre() {
        return 2*Math.PI*yaricap;
    }

    @Override
    public double getAlan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yaricap=" + yaricap +" "+" Cevre="+getCevre()+ " "+" Alan="+getAlan()+
                '}';
    }
}
