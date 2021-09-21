package Gun34._02_Soru;

import java.util.Scanner;

public class Soru {
    // Bir bisiklet sınıfı yazınız . Properties(fields) : hiz, vites
    // metodlari : hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
    // vitesAzalt() -> 1 deger vites azaltıyor, hizGoster -> O andaki hızı gösteriyor
    // vites 5 den büyük ve 1 den küçük olamıyor.

    public static void main(String[] args) {


      Bisiklet bisiklet=Bisiklet.bisikletOlsutur();

        Scanner oku=new Scanner(System.in);
        int secim;
        do {  Bisiklet.menuYaz();
              secim= oku.nextInt();
              Bisiklet.islemYap(bisiklet,secim);
        }while (secim!=5);










    }
}
