package Gun38.StaticModifier.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student("Ali","Yilmaz");
        Student ogr2=new Student("Veli","Yilmaz");
        Student ogr3=new Student("Bali","Yilmaz");
        //........
        //.......
        //.........
        Student ogr=new Student("Bora","Yilmaz");

    // bize toplam kac ogr oldugunu gosterecek bir sayyac eklersek
    // sayaclar static olmak zorunda
        System.out.println("Student toplam = " + Student.sayac);    //  bize Student.sayac = 4 verir
    // hatta bir student id olsun dersek ve sayaci ona esitlersek

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);
        System.out.println("ogr = " + ogr);

    }
}
// Static nasıl kullanılır ?!!!!!!!!!!!!!!!!!
// CLASS adı ile kullanılır.
// NE İÇİN KULLANILIR ?
//1- Direk ulasmak istedigimiz degisken ve metodlar icin (Nesne tanımlayıp kullanmak yerine,
//      tanımlamadan kullanmak istediğimiz değişken veya metdolar için)
//2- Tekrarlayan Nesnelere ait verileri tek bir değişkende toplamak için
//3- Nesneler için veya Genel için SAYAÇ olarak
//4- 3.Madde ile bağlantılı şekilde ID olarak