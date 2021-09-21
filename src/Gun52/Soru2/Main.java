package Gun52.Soru2;

public class Main {
    public static void main(String[] args) {

    Okul okul=new Okul("Mimar Sinan",300);

    Calisan teacher=new Calisan("Aycan","Fliederweg",okul,3500);
    okul.calisanEkle(teacher);
    Calisan teacher1=new Calisan("Abdullah","Fliederweg",okul,4500);
    okul.calisanEkle(teacher1);
    okul.calisanListele();
    System.out.println();

    Ogrenci ogr=new Ogrenci("Mustafa","Hörnchenweg",okul,2000);
    okul.ogrenciKayit(ogr);
    Ogrenci ogr1=new Ogrenci("Kaan","Hörnchenweg",okul,2000);
    okul.ogrenciKayit(ogr1);
    okul.ogrenciListele();


    }


}
