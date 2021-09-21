package Gun58.Ornek2;

public class Kedi extends Hayvan{
    @Override
    public void yiyecegi() {
        System.out.println("mama ve balık");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("100gr");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("16 saat uyur");
    }

    @Override
    public void sesi() {
        System.out.println("miyav");
    }
}
