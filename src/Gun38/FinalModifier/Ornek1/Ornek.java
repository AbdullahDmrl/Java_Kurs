package Gun38.FinalModifier.Ornek1;

public class Ornek {

    // bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde verilen saat, dakika ve saniyeyi alarak toplam
    // saniyeyi bulunuz.

    public static void main(String[] args) {

        int gun=23;
        int saat=7;
        int dakika=25;
        

        // 1 cozum refarans vererek
    //   Sabitler sabit=new Sabitler();
    //
    //   int toplamSaniye=(gun*sabit.haurInDay*sabit.minuteInHaur*sabit.secondInMinute)
    //           +(saat*sabit.minuteInHaur*sabit.secondInMinute+dakika*sabit.secondInMinute);


        // 2 cozum degiskenlere static eklersem direk gorebilirim

        int toplamSaniye=(gun*Sabitler.haurInDay*Sabitler.minuteInHaur*Sabitler.secondInMinute)
                +(saat*Sabitler.minuteInHaur*Sabitler.secondInMinute)+(dakika*Sabitler.secondInMinute);

        System.out.println("toplamSaniye = " + toplamSaniye);   //toplamSaniye = 2013900

    }
}
