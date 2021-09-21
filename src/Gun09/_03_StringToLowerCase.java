package Gun09;

import java.util.Locale;

public class _03_StringToLowerCase {
    public static void main(String[] args) {
        // ToLowerCase : stringi küçük çevirir.

        String text="Merhaba Dünya";

        System.out.println("ojinal hali = "+ text); //Merhaba Dünya
        System.out.println("küçük harf hali = "+ text.toLowerCase()); //merhaba dünya
        System.out.println("text büyük veya küçük harf de olsa ME ile başlıyor mu = " +
                                                          text.toLowerCase().startsWith("me")); //true

    }
}
