package Gun09;

public class _04_StringToUpperCase {
    public static void main(String[] args) {
        // ToUpperCase : stringi büyük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali = " + text); // Merhaba Dünya
        System.out.println("text in büyük harf hali = " + text.toUpperCase());// MERHABA DÜNYA
        System.out.println("text.toUpperCase().endsWith(\"YA\") = " +
                             text.toUpperCase().endsWith("YA")); //true
    }
}
