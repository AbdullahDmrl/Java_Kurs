package Gun59.Soru;

import java.util.ArrayList;

public class TechnoKitchen {

    public static void menu(){
        System.out.println("**********Menu*********");
        System.out.println("1 Adana Kebab, fiyat=5Tl");
        System.out.println("2 Lahmacun, fiyat=3Tl");
        System.out.println("3 Borsch corba, fiyat=3Tl");
        System.out.println("4 Palov bosnak pilav, fiyat=2Tl");
        System.out.println("0 Siparis veme islemi tamamlandi");

    }

    public static void siparisAl(ArrayList<IFood> siparisler, int secim){
        switch (secim){
            case 1 : AdanaKebap ad=new AdanaKebap();
                siparisler.add(ad); break;
            case 2 : Lahmacun lh=new Lahmacun();
                siparisler.add(lh);break;
            case 3 : Borsch br=new Borsch();
                siparisler.add(br); break;
            case 4 : Palov pl=new Palov();
                siparisler.add(pl);break;  }
    
    }

    public static void siparisHazirla(ArrayList<IFood> siparisler){
        int toplamUcret=0;

        System.out.println("****Siparisler ve Özellikleri******");

        for (IFood f:siparisler){

            System.out.println("*******"+f.getClass().getSimpleName()+"******");

            if (f instanceof AdanaKebap ){
                AdanaKebap ak=new AdanaKebap();
                ak.taste();
                ak.marinade();
                ak.grill();
            }
            else if (f instanceof Lahmacun ){
                Lahmacun lh=new Lahmacun();
                lh.taste();
               lh.dough();
               lh.addMeat();
               lh.bake();
            }

            else if (f instanceof Borsch ){
                Borsch br=new Borsch();
               br.taste();
               br.boil();
               br.eatTomorrow();
            }
            else if (f instanceof Palov ){
                Palov pl=new Palov();
              pl.taste();
              pl.fry();
              pl.boil();
            }
            System.out.println();
                toplamUcret+=f.ucret();
        }
        System.out.println("toplamUcret = " + toplamUcret);
    }

}
