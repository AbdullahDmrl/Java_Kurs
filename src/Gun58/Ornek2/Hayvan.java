package Gun58.Ornek2;

import java.time.LocalDate;

public abstract class Hayvan {

    private static int sayac;

    private int ID;
    private String name;
    private boolean vahsiMi;
    private LocalDate bithDay;

    public Hayvan() {
       setID();
    }

    private void setID() {
        this.ID = ++sayac;
    }

    public abstract void yiyecegi();
    public abstract void yemekMiktari();
    public abstract void gunlukUykuSuresi();
    public abstract void sesi();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVahsiMi() {
        return vahsiMi;
    }

    public void setVahsiMi(boolean vahsiMi) {
        this.vahsiMi = vahsiMi;
    }

    public LocalDate getBithDay() {
        return bithDay;
    }

    public void setBithDay(LocalDate bithDay) {
        this.bithDay = bithDay;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", vahsiMi=" + vahsiMi +
                ", bithDay=" + bithDay +
                '}';
    }
}
