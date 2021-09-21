package Gun39.Ornek3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ornek {

    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Isleme Al
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // ISLEME AL (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.

    public static void main(String[] args) {
        ArrayList<Pizza> siparisler=new ArrayList<>();
        Scanner oku=new Scanner(System.in);
           int secim= 0;

       do {
            Menu();
           System.out.print("Seciminizi giriniz=");
           secim= oku.nextInt();
            islemYap(secim,siparisler);

       } while (secim<5);

        siparisYazdir(siparisler);


    }

public static void Menu(){

        System.out.println("************MENU***********");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-Isleme Al");
        System.out.println("5-Cikis");

    }
    public static void islemYap(int secim, ArrayList<Pizza> siparisler){
            Scanner oku=new Scanner(System.in);

        switch (secim)
        {
            case 1:
                System.out.print("Kac Tane= ");
                Scanner oku1=new Scanner(System.in);
                int miktar= oku.nextInt();

                Pizza sip1=new Pizza(miktar,PizzaSize.SMALL);
                siparisler.add(sip1);break;
            case 2:
                System.out.print("Kac Tane= ");
                miktar= oku.nextInt();
                Pizza sip2=new Pizza(miktar,PizzaSize.MEDIUM);
                siparisler.add(sip2);break;

            case 3:
                System.out.print("Kac Tane= ");
                miktar= oku.nextInt();
                Pizza sip3=new Pizza(miktar,PizzaSize.LARGE);
                siparisler.add(sip3);break;
            case 4:
                for (Pizza k:siparisler){
                    System.out.println(k.miktar+" "+k.size);  }
                System.out.println("Isleme Alindi. Baska ilaveniz yoksa 5 e basiniz");break;   }    }

    public static void siparisYazdir(ArrayList<Pizza> siparisler){

        for (Pizza k:siparisler){

            System.out.println(k.miktar+" "+k.size);

        }
        System.out.println("Siparileriniz 30 dakika icinde hazir. Tesekkurler");

    }




}
