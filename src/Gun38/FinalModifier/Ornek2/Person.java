package Gun38.FinalModifier.Ornek2;



public class Person {

    String isim;
    final int tcNo;

    static int sayac=0;
    public Person(String isim)
    {
        tcNo = ++sayac;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Person{" + "TC No='" + tcNo + '\'' +
                "isim='" + isim + '\'' +
                '}';
    }
}
