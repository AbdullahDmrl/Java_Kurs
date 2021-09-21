package Gun42._02_DigerIslemler;

import java.time.LocalDate;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate buGun=LocalDate.now();
        LocalDate dun= buGun.minusDays(1);

        // bugün dün den sonra mi
        boolean sonraMi= buGun.isAfter(dun);
        System.out.println("bugün dün den sonra mi = " + sonraMi);

        // bugün dün den önce mi
        boolean onceMi= buGun.isBefore(dun);
        System.out.println("bugün dün den önce mi = " + onceMi);

        // bugün dün e EŞİT Mİ
        boolean esitMi= buGun.isEqual(dun);
        System.out.println("bugün dün e EŞİT Mİ = " + esitMi);

        // bu Tarih artık yıl mı
        boolean artikYilMi= buGun.isLeapYear();
        System.out.println("bu Tarih artık yıl mı = " + artikYilMi);

        // 2 tarih arasında fark var ise farkın en büyük olduğu
        // degeri veriyor
        int fark = buGun.compareTo(dun.minusYears(2));
        System.out.println("fark = " + fark);





    }

}
