package Gun38.StaticModifier.Ornek2;

public class Student {
    int id;
    String ad;
    String soyad;

    static int sayac=0;

    public Student(String ad, String soyad) {
       this.id=++sayac;
        this.ad = ad;
        this.soyad = soyad;

       // sayac++; yukarida esitledigim icin kaldiriyorum
    }

    @Override
    public String toString() {
        return "Student{" +"id='" + id + '\''
                +"ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
