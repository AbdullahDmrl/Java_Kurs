package Gun57.Ornrk2;

public class Cember extends Sekil{
    private double yaricap;

    public Cember(double yaricap){
        //super();
        this.yaricap=yaricap;
    }

    @Override
    double Alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    double Cevre() {
        return 2*Math.PI*yaricap;
    }
}
