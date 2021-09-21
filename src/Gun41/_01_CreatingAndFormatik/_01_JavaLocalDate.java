package Gun41._01_CreatingAndFormatik;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {

        // localDate sinifi: sadece gun, ay, yil bilgisi tutar (yyyy-MM-dd)
        LocalDate tarih=LocalDate.now(); // static oldugu icin new yazmiyoruz!!!!!!!!!

        System.out.println("tarih = " + tarih);    //2021-03-29
        System.out.println("tarih.getYear() = " + tarih.getYear()); //2021
        System.out.println("tarih.getMonth() = " + tarih.getMonth());//  MARCH
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());// 3
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth()); //29
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());// MONDAY
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear()); //88

        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("FULL Locale.GERMANY= " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        // Sistemde kullanılabilir lokalleri aşağıdaki kod ile aldık, ilgili ülkeyi if e aldık
        Locale[] kullanilabilirLokaller= Locale.getAvailableLocales();

        for(Locale l: kullanilabilirLokaller )
        {
            if (l.getDisplayCountry().toLowerCase().contains("ice"))
                System.out.println("l.getDisplayCountry() = " + l.getDisplayCountry()+" "+l);
        }

        Locale localIzlanda= new Locale("is","IS");

        System.out.println("FULL Localizsayon : Izlanda= " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localIzlanda)));

        // Kendimizde herhangi bir tarihi bu şekilde tarih değişkenine atıyoruz
        LocalDate tarih1= LocalDate.of(2020, 3, 9);
        LocalDate tarih2= LocalDate.of(2020,  Month.MARCH, 29);

        // istediğim formatta yazdırma
        System.out.println("tarih1 = " + tarih);

        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("tarih1 özel format= " + tarih1.format(ozelFormat));  // tarih1 özel format= 09.03.2020

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("EEEE d.M.yy");
        System.out.println("tarih1 özel format2= " + tarih1.format(ozelFormat2));  //tarih1 özel format2= Monday 9.3.20
    }
}
