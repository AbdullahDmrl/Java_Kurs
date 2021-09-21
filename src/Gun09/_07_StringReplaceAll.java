package Gun09;

public class _07_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır, farkı kriter(Regex) verilebilir.
        // regex=a regular expression./düzenli ifade
        // TODO : Ödev: Google dan Java regex konusu araştırlıp seçenkler öğrenilecek

        String text="Merhaba Dünya";

        System.out.println("Orjinal hali = " + text);

        System.out.println("a,b,n -> _ = " + text.replaceAll("[abn]","_"));
        // a,b,n karakterlerini ayrı ayrı bul ve _ ile değiştir : Merh___ Dü_y_

        System.out.println("Bütün büyük harfler -> _ = " + text.replaceAll("[A-Z]","_"));
        // Büyük harfleri bul _ ile değiştir. : _erhaba _ünya
    }
}
