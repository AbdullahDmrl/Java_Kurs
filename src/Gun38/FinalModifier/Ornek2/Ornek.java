package Gun38.FinalModifier.Ornek2;

public class Ornek {

    // Person isimli bir Class tanımlayınız (fields: isim, tcNo)
    // tcNo değerini int olarak alınız ve nesne oluşturulurken
    // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
    // kontrol için mainde 2 kişi tanımlayınız.

    public static void main(String[] args) {

        Person per1=new Person("Aycan");
        Person per2=new Person("Kaan");
        Person per3=new Person("Mustafa");

        System.out.println("per1 = " + per1);
        System.out.println("per2 = " + per2);
        System.out.println("per3 = " + per3);

    }

}
