package Gun58.Ornek2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Kedi kedi=new Kedi();
        kedi.setName("Boncuk");
        kedi.setVahsiMi(false);
        kedi.setBithDay(LocalDate.of(2020,12,11));
        System.out.println("kedi = " + kedi);
        kedi.yiyecegi();
        kedi.yemekMiktari();
        kedi.gunlukUykuSuresi();
        kedi.sesi();

        System.out.println("###################");

        Kartal kartal=new Kartal();
        kartal.setName("Baba Kartal");
        kartal.setVahsiMi(true);
        kartal.setBithDay(LocalDate.of(2020,12,11));
        System.out.println("Kartal = " + kartal);
        kartal.yiyecegi();
        kartal.yemekMiktari();
        kartal.gunlukUykuSuresi();
        kartal.sesi();

    }
}
