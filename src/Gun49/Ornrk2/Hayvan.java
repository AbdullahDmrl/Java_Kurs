package Gun49.Ornrk2;

public class Hayvan {
    String renk;
    int kilo;
    String cinsi;

    public Hayvan(String renk, int kilo, String cinsi) {
        this.renk = renk;
        this.kilo = kilo;
        this.cinsi = cinsi;
    }

    public void konustu()
    {
        System.out.println("hayvan konuştu...");
    }

    public void yemekYedi()
    {
        System.out.println("yemek yedi...");
    }



}
