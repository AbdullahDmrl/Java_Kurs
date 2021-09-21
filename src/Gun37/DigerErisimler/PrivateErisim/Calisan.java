package Gun37.DigerErisimler.PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surName;
    private String password;   // sadece class in icinden erilsilir

    public void sifreBelirle(String sifre){
        if (sifre.length() >= 8)
        {
            this.password = sifre;
        }
        else
        {
            System.out.println("En az 8 karakter olmalı ");
        }
    }

    public void sifreGoster()
    {
        System.out.println("****" + this.password.substring(4));

    }


}
