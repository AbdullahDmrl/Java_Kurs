package Gun36._02_JavaConsructer;

import java.util.ArrayList;

public class Kitapci {

    // Ayrı bir Book class ı yazınız.fields: name,publishYear,autor.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

    public static void main(String[] args) {

        Book kitap1=new Book("Romance",2001,"Jack London");
        Book kitap2=new Book("Blind",2003);
        Book kitap3=new Book("Cingene");

        kitap1.goster();
        kitap2.goster();
        kitap3.goster();


        // ekrana yazdırırken
        ArrayList<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(7);
        System.out.println("liste = " + liste);
        // toString(), string hali istenince o çalışıyor.

        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);



    }




}
