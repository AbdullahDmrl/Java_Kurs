package Gun32._01_Ornek;

public class Ornek {
    // 1.Adım  :Person isimli bir class yazınız:fields: name, surname, age; olsun.
    // 2.Adım  :main de 2 tane bu sınıftan nesne oluşturup değer atayınız.
    // 3.Adım  :getBirthYear isminde Person a ait bir metod yazınız, çalıştığında kişinin doğum yılını versin.
    // 4.Adım  :getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi şeklinde (Büyük harf) veren
    //          metodu yazınız. örnek ahmet demir : A.D.


    public static void main(String[] args) {
       Person kisi1=new Person();
       kisi1.name ="Sevim";
       kisi1.surName ="Yılmaz";
       kisi1.age = 20;

       Person kisi2=new Person();
       kisi2.name="Necdet";
       kisi2.surName ="Polat";
       kisi2.age = 26;

        //1. Yöntem çok uğraştırıcı
        System.out.println("kisi1 = " + kisi1.name);
        System.out.println("kisi1 = " + kisi1.surName);
        System.out.println("kisi1 = " + kisi1.age);

        System.out.println("kisi2 = " + kisi2.name);
        System.out.println("kisi2 = " + kisi2.surName);
        System.out.println("kisi2 = " + kisi2.age);

        //2.Yöntem uğraştırıcı
        BilgiYazdir(kisi1);
        BilgiYazdir(kisi2);

        System.out.println();

        //3.Yöntem : parametre bile göndermedi. en pratik
        kisi1.BilgiYazdir();
        kisi2.BilgiYazdir();

        kisi1.getBirthYear();
        kisi2.getBirthYear();

        kisi1.getInitials();
        kisi2.getInitials();
    }

    public static void BilgiYazdir(Person kisi)
    {
        System.out.println("kisi = " + kisi.name);
        System.out.println("kisi = " + kisi.surName);
        System.out.println("kisi = " + kisi.age);
    }
}



class Person
{
     String name;
     String surName;
     int age;

    public void BilgiYazdir()
    {
        System.out.println("Person kisi = " + name);
        System.out.println("Person kisi = " + surName);
        System.out.println("Person kisi = " + age);
    }

    public void getBirthYear()
    {
        System.out.println("Doğum yılı = " + (2021-age) );
    }

    public void getInitials()
    {
        System.out.println(name.toUpperCase().charAt(0)+"." + surName.toUpperCase().charAt(0));
    }

}