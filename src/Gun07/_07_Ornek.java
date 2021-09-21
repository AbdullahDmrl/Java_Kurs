package Gun07;

import java.util.Locale;
import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan boy(ondalıklı) ve kilosunu(ondalıklı) bilgisini
        // alıp ekrana tek satırda yazdırınız.

        Scanner oku=new Scanner(System.in);
        //oku.useLocale(Locale.UK); // okuma işleminde lokalizasyon (,.) setlemek için kullanılır

        System.out.print("Boyunuz="); double boy= oku.nextDouble();
        System.out.print("Kilonuz="); double kilo= oku.nextDouble();

        System.out.println("Boy = " + boy +"  Kilo= "+ kilo);
    }
}




