package Gun42._01_PeriodDuration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _01_Period {

    public static void main(String[] args) {
        // Period 2 tarih arasındaki geçen zamanı yıl ay gün olarak veriri.
        // DateTime lar için kullanılır ,
        // kendisi aynı zamanda belli bir zaman aralığınıda tutabilir.

        LocalDate dtDogumGunu=LocalDate.of(1971, 12, 11);
        LocalDate buGun = LocalDate.now();

        Period fark = Period.between(dtDogumGunu, buGun);

        System.out.println("fark = " + fark);
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("fark = " + fark.getYears() +" Yıl, "+
                fark.getMonths()+" ay, "+ fark.getDays()+" gün");


        //******

        Period period3Gun= Period.ofDays(3); // 3 günlük süreyi temsil ediyor.
        Period ceyrekYil=Period.ofMonths(3); // 3 aylık süre tutuyor.

        LocalDate ucGunSonra = buGun.plus(period3Gun); // bugüne 3 gün eklendi.
        LocalDate ucAySonra = buGun.plus(ceyrekYil); // bugüne 3 ay eklendi.
        LocalDate buGunTekrar= ucAySonra.minus(ceyrekYil); // tekrar 3 ay çıkarıldı.

        // Örnek Kursun süreleri
        LocalDate kursunBaslangic = LocalDate.of(2021, 2,1);
        Period kursSure = Period.ofMonths(8);
        LocalDate kursBitis = kursunBaslangic.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis.format(DateTimeFormatter.ISO_DATE));
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

    }

}
