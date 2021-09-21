package Gun18;

public class _01_StrinArrayDönüştürme {
    public static void main(String[] args) {

        // Stringi Diziye (Array’e) Dönüştürmek

        // toCharArray() Stringin Her Harfini Char Dizisine Aktarır

        String S1 = "Merhaba Dünya";

        char[] charArray = S1.toCharArray();


        System.out.println(charArray[0]);



        // Array String’e Dönüştürmek

        // copyValueOf() Char Dizinin İstenilen Kısmını Stringe Dönüştürür

        char[] charArray2 = {'M','E','R','H','A','B','A'};

        String S2 = String.copyValueOf(charArray); // Tamamanı Stringe Döker

        String S3 = String.copyValueOf(charArray,1,5);// 1. index ten başlayıp 5 tane karakteri kopyalar

        System.out.println(S2); // MERHABA

        System.out.println(S3); // ERHAB




    }
}
