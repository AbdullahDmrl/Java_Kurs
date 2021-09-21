package Gun38.StaticModifier;

public class Simple {

    int a;  // olusturulacak nesneye ait degisken

    //  ornek1.b  static oldugu icin ulasamayiz
    static int b;  // b nin degiskenini static yaparsak o class a ait degisken olur NESNEYE degil!!!!!!!!


    void artTir(){
        a++;
        b++;

    }
    public static void main(String[] args) {

        Simple ornek1=new Simple();
        ornek1.a=5;

        Simple ornek2=new Simple();
        ornek2.a=7;

        b=4;        // Ayni sinifin icinde oldugu icin bu sekil de de ulasabiliriz
                    // ancak baska bir sinifin icinde olsaidik asgidaki gibi class ismi ile ulasabiliriz
                    // static metodlarin icindeki her sey ya static yada nesne (yani olusturulmus)olmasi gerek!!!!!
        System.out.println("b = " + b);


        Simple.b=7; // ayni metodlarda oldugu gibi class adi ile olasabiliriz.
        Simple.b=8;  // bu durumda b guncellendi. static yaptigimizda sadece bir degeri olur.
                    // Static degiskenin sadece bir degeri olur.
        System.out.println("b = " + b); // yaparsak  b = 8 verir

        System.out.println("ornek1 = " + ornek1.a);    // ornek1 = 5
        System.out.println("ornek2 = " + ornek2.a);     //ornek2 = 7
        System.out.println("Simple b = " + Simple.b);   // Simple b = 8

        ornek1.artTir();
        ornek2.artTir();

        System.out.println("ornek1 = " + ornek1.a);    // ornek1 = 6
        System.out.println("ornek2 = " + ornek2.a);     //ornek2 = 8
        System.out.println("Simple b = " + Simple.b);   // Simple b = 10 cunku her seferinde b de artar



    }

}
