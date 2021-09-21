package Gun16;

public class _10_gununSorus {
    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        for(int i=0; i <= 255 ; i++)  // aski tablosu bilgisayar da her sayinin harf karsiligi
        {
            char harf= (char)i;

            System.out.println(i+" - " + harf);
        }

        for(int i=0; i <= 255 ; i++)  // aski tablosu bilgisayar da her sayinin harf karsiligi
        {
            char harf= (char)i;

            if (i<=10)
                System.out.println(i+" - " + harf+" ");}






    }
}
