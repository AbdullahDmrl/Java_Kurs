package Gun56.Soru;

import java.util.ArrayList;

public class OtoGaleri {
    public static void main(String[] args) {

        TeslaCar araba1=new TeslaCar("Model 5",310);

        ToyotaPirus araba2=new ToyotaPirus("Pirus",1200);

        Bus araba3=new Bus("Mercedes",7000);

        ArrayList<Vhicle> arabalar=new ArrayList<>();
        arabalar.add(araba1);
        arabalar.add(araba2);
        arabalar.add(araba3);

        for (Vhicle v:arabalar){
            System.out.println("Arac = " + v);
            System.out.println("Geldigi class = " + v.getClass().getSimpleName());
        }




    }
}
