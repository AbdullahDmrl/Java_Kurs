package Gun52.Soru1;

public class OkulMain {

    public static void main(String[] args) {

        Ogrenci ogr=new Ogrenci("Kaan","Ilk");

        System.out.println("ogr = " + ogr);

         Ogrenci lisOgr=new LiseOgrencisi("Murat","Lise");
        System.out.println("lisOgr = " + lisOgr);

        IlkOgrencisi ilkOgr=new IlkOgrencisi("Ali", "Ilkokul");
        System.out.println("ilkOgr = " + ilkOgr);






    }

}
