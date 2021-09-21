package Gun47.Ornekler.Ornek1;

public class KisiMain {

    public static void main(String[] args) {

    Kisi necdetKisisi=new Kisi();


   necdetKisisi.ad="Necdet";
   necdetKisisi.soyAd="Demir";

    //necdetKisisi.yas= -25;
    // Encapsulation aldigim icin calismaz.
     // ulasilmasini istemedigimi private yaptim

   necdetKisisi.setYas(-25); //  yanlislikla yaziyorum
   necdetKisisi.getYas();//private oldugu icin boyle alabiliyorum

        System.out.println(necdetKisisi);

    }


}
