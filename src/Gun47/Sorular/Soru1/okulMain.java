package Gun47.Sorular.Soru1;

import java.util.ArrayList;
import java.util.Scanner;

public class okulMain {
    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
    //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
    //  3- Bütün fieldlar için encapsulation uygulayınız.
    //  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
    //     ArrayList cinsinden Öğrencileri olsun.
    //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
    //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci
    //     ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.

    public static void main(String[] args) {

        ArrayList<Ogrenci> ogrencileri=new ArrayList<>();



        Okul okul=new Okul("Mimar Sinan",3,ogrencileri);
        Scanner oku=new Scanner(System.in);
        Scanner intoku=new Scanner(System.in);
        int ogrenciSayisi=1;
        boolean tekrarIste=true;
        String name ="";
        String sirName="";
        do {
            if (tekrarIste) {
                System.out.print(ogrenciSayisi + ". Ogrenci ismini giriniz=");
                name = oku.nextLine();
                System.out.print(ogrenciSayisi + ". Ogrenci soyadini giriniz=");
                sirName = oku.nextLine();
            }

            System.out.print(ogrenciSayisi+". Ogrenci yasini giriniz=");
            int age=intoku.nextInt();

            try {
                Ogrenci ogrenci=new Ogrenci(name,sirName,age);
                okul.getOgrencileri().add(ogrenci);
                ogrenciSayisi++;
                tekrarIste=true;
                System.out.println(ogrenci);
            }
            catch (Exception ex){

                tekrarIste=false;
                System.out.println(ex.getMessage());
                System.out.println("Lutfen tekrar giriniz");
            }
        }while (ogrencileri.size()< okul.getMaxOgrenciSayisi());
        System.out.println(okul);




    }
}
