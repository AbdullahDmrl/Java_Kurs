package Gun37.DigerErisimler.ProtectedErisim.Bir;

public class Doktor {
    protected String ad;   //protected

    protected Doktor() {      // protected kisim

    }

    public Doktor(String ad) {     // puplic kismi
        this.ad = ad;
    }


    public void print(){   //public

        System.out.println("ad = " + ad);
    }

}
