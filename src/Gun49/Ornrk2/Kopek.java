package Gun49.Ornrk2;

public class Kopek extends Hayvan{
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void yemekYedi() {
        super.yemekYedi();  // override ederek istedigimiz metot ve degeri degistirebiliriz
    }

    @Override
    public void konustu() {
       // super.konustu();  //Eski halininde gözükmesini istersek onuda birakabiliriz
        System.out.println("Kopek hav vav dedi"); // overreide yaparak düzenliyebiliriz
    }
}
