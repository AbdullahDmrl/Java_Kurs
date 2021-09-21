package Gun53.JavaPolimorfizm.Soru;

public class Calisan extends Kisi{

    private String departmani;
    public Calisan(String ad, String soyad, String görevi,String departmani) {
        super(ad, soyad, görevi);
        this.departmani=departmani;
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }
}
