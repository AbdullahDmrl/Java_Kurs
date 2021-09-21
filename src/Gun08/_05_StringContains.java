package Gun08;

public class _05_StringContains {
    public static void main(String[] args) {
        // bir stringin içinde karakter(lerin) var olup olmadığını kontrol eder.
        // var ise boolean cinsinden true döndürür, yoksa false olur sonuç
        
        String kelime="Merhaba Dünya";

        boolean varMi = kelime.contains("a");
        System.out.println("varMi = " + varMi); // true

        System.out.println("varMi(aba) = " + kelime.contains("aba"));
        System.out.println("varMi(f) = " + kelime.contains("f"));
        System.out.println("varMi(ya) = " + kelime.contains("ya"));
        System.out.println("varMi(A) = " + kelime.contains("A"));
    }
}
