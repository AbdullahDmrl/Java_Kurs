package Gun41._01_CreatingAndFormatik;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class _04_ZoneDateTime {

    public static void main(String[] args) {
        // Başka Zaman bölgesinin saat dilimlerini alma

        ZonedDateTime zdtLocal= ZonedDateTime.now(); // Lokal DateTime alır.

        // Zoneları sistemden nasıl alabilirim.
        Set<String> zamanBolgeleri= ZoneId.getAvailableZoneIds();
        for(String z: zamanBolgeleri)
        {
            if (z.toLowerCase().contains("honol"))
                System.out.println("z = " + z);
        }

        //istenilen zonu aldım ve ZoneId oluşturdum
        ZoneId istenilenBolgeZonu = ZoneId.of("Pacific/Honolulu");
        ZonedDateTime zdt=ZonedDateTime.now( istenilenBolgeZonu );
        System.out.println("zdt = " + zdt);

        DateTimeFormatter gosterimSablonu=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy HH:mm");
        System.out.println("zdt = " + zdt.format(gosterimSablonu));
    }

}
