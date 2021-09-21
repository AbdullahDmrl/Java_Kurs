package Gun53.JavaPolimorfizm.Soru;

public class Main {
    public static void main(String[] args) {

        Ogrenci ogrenci=new Ogrenci("Aycan","Celik","Baskan","8A");
        Calisan calisan=new Calisan("Abdullah","Demirel","Ogretmen","Math");

        Kisi.kimlikYaz(ogrenci);
        Kisi.kimlikYaz(calisan);

        //((Ogrenci)ogrenci).getSube()


    }



}
