package Gun43._02_JavaException;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program başladı");

        try { // dene, hatanın başladığı yerin üstüne konur

            System.out.println("Tarih setleniyor");
            LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
            System.out.println("işlem tamam");

        } // hata olduğu zaman programı kırma
        catch (Exception hata)// hata isimli değişkende oluşan hataların bilgisi atanıyor
        {
            System.out.println("Lütfen 0-31 ara sı gün giniz");
            System.out.println("hata.getMessage() = " + hata.getMessage()); // hatanın mesajı
        }

        System.out.println("Programın bu bölümünde diğer metodlar çalışıyor.");

        System.out.println("Program Sonu");




    }
}
