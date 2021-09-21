package Gun41._01_CreatingAndFormatik;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_LocalTime {

    public static void main(String[] args) {

      // Tarih icermez saat, dakika, saniye nanosaniye bilgisi icerir

        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);   // o andaki saati alir guncelemez
        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("saat.format(ozelFormat) = " + saat.format(ozelFormat));

        LocalTime saat1=LocalTime.of(21,34);
        System.out.println("saat1 = " + saat1);
        LocalTime saat2=LocalTime.of(21,34,45);
        System.out.println("saat2 = " + saat2);



    }




}
