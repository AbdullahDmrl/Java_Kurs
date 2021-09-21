package Gun51.Soru2.Paket2;

import Gun51.Soru2.Paket1.p1Hayvan;

public class p2Kedi extends p1Hayvan {
    // extends edildiginde protected degiskenlere ulasabiliyoruz inheritance

    public p2Kedi(String ad,String cinsi) {
        super.ad=ad;
        super.cinsi=cinsi;
    }

    @Override
    public String toString() {
        return "p2Kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
